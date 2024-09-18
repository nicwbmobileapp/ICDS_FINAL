package com.example.icds

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AwcHistoryDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awc_history_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnDashboard = findViewById<View>(R.id.btnDashboard);

        btnDashboard.setOnClickListener(){
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


        val dist_is_under_sa_awc_inf_prev =
            findViewById<LinearLayout>(R.id.dist_is_under_sa_awc_inf_prev)
        val dist_is_under_sa_awc_inf_prevTv1 =
            dist_is_under_sa_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val dist_is_under_sa_awc_inf_prevTv2 =
            dist_is_under_sa_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        dist_is_under_sa_awc_inf_prevTv1.text =
            "Whether district is under Saksham Anganwadi (For Murshidabad /Birbhum/ nadia/maldah/Dakshin Dinajpur)"
//        dist_is_under_sa_awc_inf_prevTv2.text = AwcInfraDataStorage.dataMap["isDistUnderSaSpinner"]
//        dist_is_under_sa_awc_inf_prevTv2.text = DataHolder.DataMap["isDistUnderSaSpinner"]
        dist_is_under_sa_awc_inf_prevTv2.text = "yes"


        val name_0f_the_proj_awc_inf_prev =
            findViewById<LinearLayout>(R.id.name_0f_the_proj_awc_inf_prev)
        val name_0f_the_proj_awc_inf_prev_Tv1 =
            name_0f_the_proj_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val name_0f_the_proj_awc_inf_prev_Tv2 =
            name_0f_the_proj_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        name_0f_the_proj_awc_inf_prev_Tv1.text = "Name of the project (Block / Municipality)"
//        name_0f_the_proj_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["projectNameVal"]
//        name_0f_the_proj_awc_inf_prev_Tv2.text = DataHolder.DataMap["projectNameVal"]
        name_0f_the_proj_awc_inf_prev_Tv2.text = "Kaliachak"


        val name_0f_gram_panchayat_awc_inf_prev =
            findViewById<LinearLayout>(R.id.name_0f_gram_panchayat_awc_inf_prev)
        val name_0f_gram_panchayat_awc_inf_prev_Tv1 =
            name_0f_gram_panchayat_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val name_0f_gram_panchayat_awc_inf_prev_Tv2 =
            name_0f_gram_panchayat_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        name_0f_gram_panchayat_awc_inf_prev_Tv1.text = "Name of the project (Block / Municipality)"
//        name_0f_gram_panchayat_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["gpNameTv"]
//        name_0f_gram_panchayat_awc_inf_prev_Tv2.text = DataHolder.DataMap["gpNameTv"]
        name_0f_gram_panchayat_awc_inf_prev_Tv2.text = "Krishnapur"


        val distance_to_nearest_health_center_awc_inf_prev =
            findViewById<LinearLayout>(R.id.distance_to_nearest_health_center_awc_inf_prev)
        val distance_to_nearest_health_center_awc_inf_prev_Tv1 =
            distance_to_nearest_health_center_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val distance_to_nearest_health_center_awc_inf_prev_Tv2 =
            distance_to_nearest_health_center_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        distance_to_nearest_health_center_awc_inf_prev_Tv1.text =
            "Distance to Nearest Health Centre "
//        distance_to_nearest_health_center_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["distOfNearestHospitalVal"]
//        distance_to_nearest_health_center_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["distOfNearestHospitalVal"]
        distance_to_nearest_health_center_awc_inf_prev_Tv2.text ="<500 mtrs"


        val awc_name_awc_inf_prev = findViewById<LinearLayout>(R.id.awc_name_awc_inf_prev)
        val awc_name_awc_inf_prev_Tv1 =
            awc_name_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val awc_name_awc_inf_prev_Tv2 =
            awc_name_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        awc_name_awc_inf_prev_Tv1.text = "Name of AWC"
//        awc_name_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["nameOfAWCVal"]
//        awc_name_awc_inf_prev_Tv2.text = DataHolder.DataMap["nameOfAWCVal"]
        awc_name_awc_inf_prev_Tv2.text = "Awc Name"


        val awc_code_awc_inf_prev = findViewById<LinearLayout>(R.id.awc_code_awc_inf_prev)
        val awc_code_awc_inf_prev_Tv1 =
            awc_code_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val awc_code_awc_inf_prev_Tv2 =
            awc_code_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        awc_code_awc_inf_prev_Tv1.text = "AWC Code"
//        awc_code_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["awcCodeVal"]
//        awc_code_awc_inf_prev_Tv2.text = DataHolder.DataMap["awcCodeVal"]
        awc_code_awc_inf_prev_Tv2.text = "AWC009988"



        val whether_aww_in_position_awc_inf_prev =
            findViewById<LinearLayout>(R.id.whether_aww_in_position_awc_inf_prev)
        val whether_aww_in_position_awc_inf_prev_Tv1 =
            whether_aww_in_position_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val whether_aww_in_position_awc_inf_prev_Tv2 =
            whether_aww_in_position_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        whether_aww_in_position_awc_inf_prev_Tv1.text = "Whether AWW in position"
//        whether_aww_in_position_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["whetherAwwInPositionVal"]
//        whether_aww_in_position_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["whetherAwwInPositionVal"]
        whether_aww_in_position_awc_inf_prev_Tv2.text = "Yes"


        val whether_awh_in_position_awc_inf_prev =
            findViewById<LinearLayout>(R.id.whether_awh_in_position_awc_inf_prev)
        val whether_awh_in_position_awc_inf_prev_Tv1 =
            whether_awh_in_position_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val whether_awh_in_position_awc_inf_prev_Tv2 =
            whether_awh_in_position_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        whether_awh_in_position_awc_inf_prev_Tv1.text = "Whether AWH in position"
//        whether_awh_in_position_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["whetherAwhInPositionVal"]
//        whether_awh_in_position_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["whetherAwhInPositionVal"]
        whether_awh_in_position_awc_inf_prev_Tv2.text = "Yes"


        val whether_AWCis_in_main_charge_of_AWW_awc_inf_prev =
            findViewById<LinearLayout>(R.id.whether_AWCis_in_main_charge_of_AWW_awc_inf_prev)
        val whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv1 =
            whether_AWCis_in_main_charge_of_AWW_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv2 =
            whether_AWCis_in_main_charge_of_AWW_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv1.text =
            "Whether this AWCis in main charge of AWW"
//        whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["whetherAwcIsInMainChargeOfAwwVal"]
//        whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["whetherAwcIsInMainChargeOfAwwVal"]
        whether_AWCis_in_main_charge_of_AWW_awc_inf_prev_Tv2.text = "No"


        val mobile_number_awc_inf_prev = findViewById<LinearLayout>(R.id.mobile_number_awc_inf_prev)
        val mobile_number_awc_inf_prevTv1 =
            mobile_number_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val mobile_number_awc_inf_prevTv2 =
            mobile_number_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        mobile_number_awc_inf_prevTv1.text = "Mobile Number"
//        mobile_number_awc_inf_prevTv2.text = AwcInfraDataStorage.dataMap["mobileNoVal"]
//        mobile_number_awc_inf_prevTv2.text = DataHolder.DataMap["mobileNoVal"]
        mobile_number_awc_inf_prevTv2.text = "86378102**"


        val ownership_building_awc_inf_prev =
            findViewById<LinearLayout>(R.id.ownership_building_awc_inf_prev)
        val ownership_building_awc_inf_prev_Tv1 =
            ownership_building_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val ownership_building_awc_inf_prev_Tv2 =
            ownership_building_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        ownership_building_awc_inf_prev_Tv1.text = "Ownership of Building"
//        ownership_building_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["ownershipOfBuilding"]
//        ownership_building_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["ownershipOfBuilding"]
        ownership_building_awc_inf_prev_Tv2.text = "Open space"


        val building_type_awc_inf_prev = findViewById<LinearLayout>(R.id.building_type_awc_inf_prev)
        val building_type_awc_inf_prev_Tv1 =
            building_type_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val building_type_awc_inf_prev_Tv2 =
            building_type_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        building_type_awc_inf_prev_Tv1.text = "Building type"
//        building_type_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["buildingTypeVal"]
//        building_type_awc_inf_prev_Tv2.text = DataHolder.DataMap["buildingTypeVal"]
        building_type_awc_inf_prev_Tv2.text = "Kuccha"


        val total_land_in_decimal_awc_inf_prev =
            findViewById<LinearLayout>(R.id.total_land_in_decimal_awc_inf_prev)
        val total_land_in_decimal_awc_inf_prev_Tv1 =
            total_land_in_decimal_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val total_land_in_decimal_awc_inf_prev_Tv2 =
            total_land_in_decimal_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        total_land_in_decimal_awc_inf_prev_Tv1.text =
            "Total Land Available within premises (in decimal)"
        total_land_in_decimal_awc_inf_prev_Tv2.text ="3"
//        total_land_in_decimal_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["premisesAvlLandVal"]
//        total_land_in_decimal_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["premisesAvlLandVal"]


        val is_land_govt_reg_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_land_govt_reg_awc_inf_prev)
        val is_land_govt_reg_awc_inf_prev_Tv1 =
            is_land_govt_reg_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_land_govt_reg_awc_inf_prev_Tv2 =
            is_land_govt_reg_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_land_govt_reg_awc_inf_prev_Tv1.text =
            "Whether land is registered in favour of government"
        is_land_govt_reg_awc_inf_prev_Tv2.text = "Yes"
//        is_land_govt_reg_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["whetherLandIsRegisterdFavourOfGovtVal"]
//        is_land_govt_reg_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["whetherLandIsRegisterdFavourOfGovtVal"]


        val name_of_scheme_for_construction_awc_inf_prev =
            findViewById<LinearLayout>(R.id.name_of_scheme_for_construction_awc_inf_prev)
        val name_of_scheme_for_construction_awc_inf_prev_Tv1 =
            name_of_scheme_for_construction_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val name_of_scheme_for_construction_awc_inf_prev_Tv2 =
            name_of_scheme_for_construction_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        name_of_scheme_for_construction_awc_inf_prev_Tv1.text = "Name of Scheme (For Construction)"
        name_of_scheme_for_construction_awc_inf_prev_Tv2.text = "RIDF"
//        name_of_scheme_for_construction_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["nameOfSchemeVal"]
//        name_of_scheme_for_construction_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["nameOfSchemeVal"]


        val building_construction_date_awc_inf_prev =
            findViewById<LinearLayout>(R.id.building_construction_date_awc_inf_prev)
        val building_construction_date_awc_inf_prev_Tv1 =
            building_construction_date_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val building_construction_date_awc_inf_prev_Tv2 =
            building_construction_date_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        building_construction_date_awc_inf_prev_Tv1.text = "Date of Construction of Building"
        building_construction_date_awc_inf_prev_Tv2.text = "Unknown"
//        building_construction_date_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["dateOfConstructionBuildingVal"]
//        building_construction_date_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["dateOfConstructionBuildingVal"]


        val type_of_building_awc_inf_prev =
            findViewById<LinearLayout>(R.id.type_of_building_awc_inf_prev)
        val type_of_building_awc_inf_prev_Tv1 =
            type_of_building_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val type_of_building_awc_inf_prev_Tv2 =
            type_of_building_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        type_of_building_awc_inf_prev_Tv1.text = "Type of Building"
        type_of_building_awc_inf_prev_Tv2.text = "BALA Model"
//        type_of_building_awc_inf_prev_Tv2.text = AwcInfraDataStorage.dataMap["typeOfBuildingVal"]
//        type_of_building_awc_inf_prev_Tv2.text = DataHolder.DataMap["typeOfBuildingVal"]


        val type_of_drinking_water_awc_inf_prev =
            findViewById<LinearLayout>(R.id.type_of_drinking_water_awc_inf_prev)
        val type_of_drinking_water_awc_inf_prev_Tv1 =
            type_of_drinking_water_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val type_of_drinking_water_awc_inf_prev_Tv2 =
            type_of_drinking_water_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        type_of_drinking_water_awc_inf_prev_Tv1.text = "Type of Drinking water"
        type_of_drinking_water_awc_inf_prev_Tv2.text = "Tube well"
//        type_of_drinking_water_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["typeOfDrinkingWaterVal"]
//        type_of_drinking_water_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["typeOfDrinkingWaterVal"]


        val whether_drinking_water_available_in_premises_awc_inf_prev =
            findViewById<LinearLayout>(R.id.whether_drinking_water_available_in_premises_awc_inf_prev)
        val whether_drinking_water_available_in_premises_awc_inf_prev_Tv1 =
            whether_drinking_water_available_in_premises_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val whether_drinking_water_available_in_premises_awc_inf_prev_Tv2 =
            whether_drinking_water_available_in_premises_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        whether_drinking_water_available_in_premises_awc_inf_prev_Tv1.text =
            "Whether Drinking  Water facility available within premises"
        whether_drinking_water_available_in_premises_awc_inf_prev_Tv2.text = "Yes "
//        whether_drinking_water_available_in_premises_awc_inf_prev_Tv2.text =
//            AwcInfraDataStorage.dataMap["whetherDrinkingWaterAvlWithinPremisesVal"]
//        whether_drinking_water_available_in_premises_awc_inf_prev_Tv2.text =
//            DataHolder.DataMap["whetherDrinkingWaterAvlWithinPremisesVal"]


        val whether_water_filter_ro_available_awc_inf_prev =
            findViewById<LinearLayout>(R.id.whether_water_filter_ro_available_awc_inf_prev)
        val whether_water_filter_ro_available_awc_inf_prev_tv1 =
            whether_water_filter_ro_available_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val whether_water_filter_ro_available_awc_inf_prev_tv2 =
            whether_water_filter_ro_available_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        whether_water_filter_ro_available_awc_inf_prev_tv1.text =
            "Whether following facilities are available"
        whether_water_filter_ro_available_awc_inf_prev_tv2.text = "Water filter"
//        whether_water_filter_ro_available_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["whetherWaterFilterRoAvlVal"]
//        whether_water_filter_ro_available_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["whetherWaterFilterRoAvlVal"]


        val src_of_funds_awc_inf_prev = findViewById<LinearLayout>(R.id.src_of_funds_awc_inf_prev)
        val src_of_funds_awc_inf_prev_tv1 =
            src_of_funds_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val src_of_funds_awc_inf_prev_tv2 =
            src_of_funds_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        src_of_funds_awc_inf_prev_tv1.text =
            "Source of Funds ( For tap-water/tube-well/Hand –pump if available in premises)"
        src_of_funds_awc_inf_prev_tv2.text ="Zeela parishad"
//        src_of_funds_awc_inf_prev_tv2.text = AwcInfraDataStorage.dataMap["sourceOfFundsVal"]
//        src_of_funds_awc_inf_prev_tv2.text = DataHolder.DataMap["sourceOfFundsVal"]


        val water_outside_source_awc_inf_prev =
            findViewById<LinearLayout>(R.id.water_outside_source_awc_inf_prev)
        val water_outside_source_awc_inf_prev_tv1 =
            water_outside_source_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val water_outside_source_awc_inf_prev_tv2 =
            water_outside_source_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        water_outside_source_awc_inf_prev_tv1.text = "Water availed from outside sources"
        water_outside_source_awc_inf_prev_tv2.text = "Pond"
//        water_outside_source_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["waterAvailedFromOutsideVal"]
//        water_outside_source_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["waterAvailedFromOutsideVal"]


        val water_facility_distance_from_awc_premises_awc_inf_prev =
            findViewById<LinearLayout>(R.id.water_facility_distance_from_awc_premises_awc_inf_prev)
        val water_facility_distance_from_awc_premises_awc_inf_prev_tv1 =
            water_facility_distance_from_awc_premises_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val water_facility_distance_from_awc_premises_awc_inf_prev_tv2 =
            water_facility_distance_from_awc_premises_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        water_facility_distance_from_awc_premises_awc_inf_prev_tv1.text =
            "Distance of water facility from AWC premises  (In case it  is not available inside premises)"
        water_facility_distance_from_awc_premises_awc_inf_prev_tv2.text =">50m"
//        water_facility_distance_from_awc_premises_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["distanceOfWaterFacilityFromAwcPremisesVal"]
//        water_facility_distance_from_awc_premises_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["distanceOfWaterFacilityFromAwcPremisesVal"]


        val toilet_structure_awc_inf_prev =
            findViewById<LinearLayout>(R.id.toilet_structure_awc_inf_prev)
        val toilet_structure_awc_inf_prev_tv1 =
            toilet_structure_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val toilet_structure_awc_inf_prev_tv2 =
            toilet_structure_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        toilet_structure_awc_inf_prev_tv1.text = "Toilet Structure"
        toilet_structure_awc_inf_prev_tv2.text = "Kuccha"
//        toilet_structure_awc_inf_prev_tv2.text = AwcInfraDataStorage.dataMap["toiletStructureVal"]
//        toilet_structure_awc_inf_prev_tv2.text = DataHolder.DataMap["toiletStructureVal"]


        val toilet_condition_awc_inf_prev =
            findViewById<LinearLayout>(R.id.toilet_condition_awc_inf_prev)
        val toilet_condition_awc_inf_prev_tv1 =
            toilet_condition_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val toilet_condition_awc_inf_prev_tv2 =
            toilet_condition_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        toilet_condition_awc_inf_prev_tv1.text = "Toilet Condition"
        toilet_condition_awc_inf_prev_tv2.text = "Bad"
//        toilet_condition_awc_inf_prev_tv2.text = AwcInfraDataStorage.dataMap["toiletConditionVal"]
//        toilet_condition_awc_inf_prev_tv2.text = DataHolder.DataMap["toiletConditionVal"]


        val type_of_toilet_awc_inf_prev =
            findViewById<LinearLayout>(R.id.type_of_toilet_awc_inf_prev)
        val type_of_toilet_awc_inf_prev_tv1 =
            type_of_toilet_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val type_of_toilet_awc_inf_prev_tv2 =
            type_of_toilet_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        type_of_toilet_awc_inf_prev_tv1.text = "Type of toilet"
        type_of_toilet_awc_inf_prev_tv2.text ="Indian"
//        type_of_toilet_awc_inf_prev_tv2.text = AwcInfraDataStorage.dataMap["typeOfToiletVal"]
//        type_of_toilet_awc_inf_prev_tv2.text = DataHolder.DataMap["typeOfToiletVal"]


        val is_toilet_avl_within_premises_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_toilet_avl_within_premises_awc_inf_prev)
        val is_toilet_avl_within_premises_awc_inf_prev_tv1 =
            is_toilet_avl_within_premises_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_toilet_avl_within_premises_awc_inf_prev_tv2 =
            is_toilet_avl_within_premises_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_toilet_avl_within_premises_awc_inf_prev_tv1.text =
            "Features of Toilet : Available within Premises"
        is_toilet_avl_within_premises_awc_inf_prev_tv2.text = "Yes"
//        is_toilet_avl_within_premises_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["toiletAvlWithinPremisesVal"]
//        is_toilet_avl_within_premises_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["toiletAvlWithinPremisesVal"]


        val is_toilet_functional_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_toilet_functional_awc_inf_prev)
        val is_toilet_functional_awc_inf_prev_tv1 =
            is_toilet_functional_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_toilet_functional_awc_inf_prev_tv2 =
            is_toilet_functional_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_toilet_functional_awc_inf_prev_tv1.text = "Features of Toilet : Whether Functional"
        is_toilet_functional_awc_inf_prev_tv2.text = "Yes"
//        is_toilet_functional_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["isToiletFunctionalVal"]
//        is_toilet_functional_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["isToiletFunctionalVal"]


        val is_running_water_avl_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_running_water_avl_awc_inf_prev)
        val is_running_water_avl_awc_inf_prev_tv1 =
            is_running_water_avl_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_running_water_avl_awc_inf_prev_tv2 =
            is_running_water_avl_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_running_water_avl_awc_inf_prev_tv1.text =
            "Features of Toilet : Whether running water facility is available"
        is_running_water_avl_awc_inf_prev_tv2.text = "Yes"
//        is_running_water_avl_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["isRunningWaterFacilityAvlVal"]
//        is_running_water_avl_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["isRunningWaterFacilityAvlVal"]


        val is_tap_installed_in_toilet_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_tap_installed_in_toilet_awc_inf_prev)
        val is_tap_installed_in_toilet_awc_inf_prev_tv1 =
            is_tap_installed_in_toilet_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_tap_installed_in_toilet_awc_inf_prev_tv2 =
            is_tap_installed_in_toilet_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_tap_installed_in_toilet_awc_inf_prev_tv1.text =
            "Features of Toilet : Whether tap is installed in Toilet"
        is_tap_installed_in_toilet_awc_inf_prev_tv2.text = "Yes"
//        is_tap_installed_in_toilet_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["isTapInstalledInToiletVal"]
//        is_tap_installed_in_toilet_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["isTapInstalledInToiletVal"]


        val is_toilet_child_friendly_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_toilet_child_friendly_awc_inf_prev)
        val is_toilet_child_friendly_awc_inf_prev_tv1 =
            is_toilet_child_friendly_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_toilet_child_friendly_awc_inf_prev_tv2 =
            is_toilet_child_friendly_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_toilet_child_friendly_awc_inf_prev_tv1.text =
            "Features of Toilet : Whether toilet is child friendly"
        is_toilet_child_friendly_awc_inf_prev_tv2.text = "Yes"
//        is_toilet_child_friendly_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["isToiletChildFriendlyVal"]
//        is_toilet_child_friendly_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["isToiletChildFriendlyVal"]


        val is_toilet_inside_building_or_outside_awc_inf_prev =
            findViewById<LinearLayout>(R.id.is_toilet_inside_building_or_outside_awc_inf_prev)
        val is_toilet_inside_building_or_outside_awc_inf_prev_tv1 =
            is_toilet_inside_building_or_outside_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val is_toilet_inside_building_or_outside_awc_inf_prev_tv2 =
            is_toilet_inside_building_or_outside_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        is_toilet_inside_building_or_outside_awc_inf_prev_tv1.text =
            "Whether toilet is within building or built separately"
        is_toilet_inside_building_or_outside_awc_inf_prev_tv2.text = "Within Building"
//        is_toilet_inside_building_or_outside_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["isToiletWithinBuildingVal"]
//        is_toilet_inside_building_or_outside_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["isToiletWithinBuildingVal"]


        val construction_building_date_awc_inf_prev =
            findViewById<LinearLayout>(R.id.construction_building_date_awc_inf_prev)
        val construction_building_date_awc_inf_prev_tv1 =
            construction_building_date_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val construction_building_date_awc_inf_prev_tv2 =
            construction_building_date_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        construction_building_date_awc_inf_prev_tv1.text = "Date of construction of toilet"
        construction_building_date_awc_inf_prev_tv2.text = "04/09/2000"
//        construction_building_date_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["dobOfConstOfToilet"]
//        construction_building_date_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["dobOfConstOfToilet"]


        val source_fund_for_const_awc_inf_prev =
            findViewById<LinearLayout>(R.id.source_fund_for_const_awc_inf_prev)
        val source_fund_for_const_awc_inf_prev_tv1 =
            source_fund_for_const_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val source_fund_for_const_awc_inf_prev_tv2 =
            source_fund_for_const_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        source_fund_for_const_awc_inf_prev_tv1.text = "Source of fund for constructiont"
        source_fund_for_const_awc_inf_prev_tv2.text ="Zilla Parisad"
//        source_fund_for_const_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["sourceOfFundForToiletConstVal"]
//        source_fund_for_const_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["sourceOfFundForToiletConstVal"]


        val has_separate_store_room_awc_inf_prev =
            findViewById<LinearLayout>(R.id.has_separate_store_room_awc_inf_prev)
        val has_separate_store_room_awc_inf_prev_tv1 =
            has_separate_store_room_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val has_separate_store_room_awc_inf_prev_tv2 =
            has_separate_store_room_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        has_separate_store_room_awc_inf_prev_tv1.text = "Whether AWC has separate store room"
        has_separate_store_room_awc_inf_prev_tv2.text = "Yes"
//        has_separate_store_room_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["hasSeparateStoreRoomVal"]
//        has_separate_store_room_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["hasSeparateStoreRoomVal"]


        val structure_store_room_awc_inf_prev =
            findViewById<LinearLayout>(R.id.structure_store_room_awc_inf_prev)
        val structure_store_room_awc_inf_prev_tv1 =
            structure_store_room_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val structure_store_room_awc_inf_prev_tv2 =
            structure_store_room_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        structure_store_room_awc_inf_prev_tv1.text = "Structure of store room"
        structure_store_room_awc_inf_prev_tv2.text = "Open"
//        structure_store_room_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["structureOfStoreRoomVal"]
//        structure_store_room_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["structureOfStoreRoomVal"]


        val kitchen_structure_awc_inf_prev =
            findViewById<LinearLayout>(R.id.kitchen_structure_awc_inf_prev)
        val kitchen_structure_awc_inf_prev_tv1 =
            kitchen_structure_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val kitchen_structure_awc_inf_prev_tv2 =
            kitchen_structure_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        kitchen_structure_awc_inf_prev_tv1.text = "Description of Kitchen"
        kitchen_structure_awc_inf_prev_tv2.text = "Open"
//        kitchen_structure_awc_inf_prev_tv2.text = AwcInfraDataStorage.dataMap["descOfKitchenVal"]
//        kitchen_structure_awc_inf_prev_tv2.text = DataHolder.DataMap["descOfKitchenVal"]


        val has_separate_kitchen_shed_awc_inf_prev =
            findViewById<LinearLayout>(R.id.has_separate_kitchen_shed_awc_inf_prev)
        val has_separate_kitchen_shed_awc_inf_prev_tv1 =
            has_separate_kitchen_shed_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val has_separate_kitchen_shed_awc_inf_prev_tv2 =
            has_separate_kitchen_shed_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        has_separate_kitchen_shed_awc_inf_prev_tv1.text = "Whether AWC has separate kitchen shed"
        has_separate_kitchen_shed_awc_inf_prev_tv2.text = "No"
//        has_separate_kitchen_shed_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["hasSeparateKitchenShedVal"]
//        has_separate_kitchen_shed_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["hasSeparateKitchenShedVal"]


        val condition_of_kitchen_shed_awc_inf_prev =
            findViewById<LinearLayout>(R.id.condition_of_kitchen_shed_awc_inf_prev)
        val condition_of_kitchen_shed_awc_inf_prev_tv1 =
            condition_of_kitchen_shed_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val condition_of_kitchen_shed_awc_inf_prev_tv2 =
            condition_of_kitchen_shed_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        condition_of_kitchen_shed_awc_inf_prev_tv1.text = "Condition of Kitchen Shed"
        condition_of_kitchen_shed_awc_inf_prev_tv2.text = "Good"
//        condition_of_kitchen_shed_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["conditionOfKitchenShed"]
//        condition_of_kitchen_shed_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["conditionOfKitchenShed"]


        val has_adequate_utensils_awc_inf_prev =
            findViewById<LinearLayout>(R.id.has_adequate_utensils_awc_inf_prev)
        val has_adequate_utensils_awc_inf_prev_tv1 =
            has_adequate_utensils_awc_inf_prev.findViewById<TextView>(R.id.tv1_awc_common_card)
        val has_adequate_utensils_awc_inf_prev_tv2 =
            has_adequate_utensils_awc_inf_prev.findViewById<TextView>(R.id.tv2_awc_common_card)
        has_adequate_utensils_awc_inf_prev_tv1.text = "Whether AWC has adequate Utensils"
        has_adequate_utensils_awc_inf_prev_tv2.text = "Yes"
//        has_adequate_utensils_awc_inf_prev_tv2.text =
//            AwcInfraDataStorage.dataMap["awcHasAdequeteUtensils"]
//        has_adequate_utensils_awc_inf_prev_tv2.text =
//            DataHolder.DataMap["awcHasAdequeteUtensils"]





    }
}