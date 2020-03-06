package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Bachleor_degreeRepositary;
import com.assimilate.matrimony.dao.CountryRepositary;
import com.assimilate.matrimony.dao.EmployeementRepositary;
import com.assimilate.matrimony.dao.Master_degreeRepositary;
import com.assimilate.matrimony.dao.OccupationRepositary;
import com.assimilate.matrimony.dao.UserRepositary;
import com.assimilate.matrimony.dao.career_detailRepositary;
import com.assimilate.matrimony.domain.BacholerDegree;
import com.assimilate.matrimony.domain.CareerDetail;
import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.domain.Employeement;
import com.assimilate.matrimony.domain.MasterDegree;
import com.assimilate.matrimony.domain.Occupation;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.Career_detaiService;

@Service
public class Career_detailServiceImpl implements Career_detaiService {
	@Autowired
	private career_detailRepositary career_detailrepositary;
	@Autowired
	private UserRepositary userrepositary;
	@Autowired
	private Master_degreeRepositary master_degreeRepositary;
	@Autowired
	private CountryRepositary countryRepositary;
	@Autowired
	private Bachleor_degreeRepositary bachleor_degreeRepositary;
	@Autowired
	private EmployeementRepositary employeementRepositary;
	@Autowired
	private OccupationRepositary occupationRepositary;
	@Autowired
	private UserRepositary userRepositary;

	@Override
	public CareerDetail createCarrier(CareerDetail careerDetail) {
		Country country = careerDetail.getCountry();
		Optional<Country> country2 = countryRepositary.findById(country.getCountry_id());
		if (country2 != null) {
			MasterDegree masterDegree = careerDetail.getMasterdegree();
			Optional<MasterDegree> masterDegree2 = master_degreeRepositary.findById(masterDegree.getMaster_degree_id());
			if (masterDegree2 != null) {
				BacholerDegree bacholerDegree = careerDetail.getBacholerDegree();
				Optional<BacholerDegree> bacholerDegree2 = bachleor_degreeRepositary
						.findById(bacholerDegree.getBacholer_Degree_id());
				if (bacholerDegree2 != null) {
					Employeement employeement = careerDetail.getEmployeement();
					Optional<Employeement> employeement2 = employeementRepositary
							.findById(employeement.getEmployeement_id());
					if (employeement2 != null) {
						Occupation occupation = careerDetail.getOccupation();
						Optional<Occupation> occupation2 = occupationRepositary.findById(occupation.getOccupation_id());
						if (occupation2 != null) {
							User user = careerDetail.getUser();
							Optional<User> user2 = userRepositary.findById(user.getUser_id());
							if (user2 != null) {
								career_detailrepositary.save(careerDetail);
							}
						}
					}
				}
			}
		}
		return careerDetail;
	}

	@Override
	public List<CareerDetail> getAllDetails() {
		return career_detailrepositary.findAll();
	}

	@Override
	public CareerDetail getUserBy_Id(int user_id) {
		CareerDetail c = career_detailrepositary.findByUserId(user_id);
		return c;
	}

	@Override
	public void deleteRecordBasedOnUser_id(int user_id) {
		career_detailrepositary.deleteByUserId(user_id);
	}

	@Override
	public CareerDetail updateRecordsById(Integer user_id, int careerdetail_id, CareerDetail careerDetail) {
		User user = userrepositary.getOne(user_id);
		System.out.println("userdetails" + user);
		if (user != null) {
			Optional<CareerDetail> careerdetailsObj = career_detailrepositary.findById(careerdetail_id);
			careerDetail.setUser(user);
			if (careerdetailsObj != null) {
				careerDetail.setCareerdetail_id(careerdetail_id);
				career_detailrepositary.save(careerDetail);
			}
			System.out.println(careerDetail);
		} else {
			System.out.println("data not inserted");
		}
		return careerDetail;
	}
}
