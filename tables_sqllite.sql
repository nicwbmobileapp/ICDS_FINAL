-- SQLite script

-- Table: awc_infrastructure
CREATE TABLE awc_infrastructure (
    district_saksham_awc CHAR(1),
    project_id VARCHAR(4) NOT NULL,
    gp_id CHAR(3),
    health_centre_distance_id VARCHAR(1),
    awc_id VARCHAR(4) NOT NULL,
    aww_in_position CHAR(1),
    awh_in_position CHAR(1),
    awc_main_charge_of_aww CHAR(1),
    mobile_no CHAR(10),
    building_ownership_id VARCHAR(2),
    building_structure_type_id VARCHAR(1),
    tot_land NUMERIC(18, 4),
    govt_registered_land CHAR(1),
    scheme_id VARCHAR(2),
    construction_dt DATE,
    building_type_id VARCHAR(2),
    drinking_water_source_type_id VARCHAR(2),
    drinking_water_in_premises CHAR(1),
    drinking_water_facility_id VARCHAR(50),
    source_of_fund_id VARCHAR(2),
    outside_water_source VARCHAR(2),
    water_source_from_awc_id VARCHAR(2),
    toilet_structure_id VARCHAR(2),
    toilet_condition_id VARCHAR(2),
    toilet_type_id VARCHAR(2),
    toilet_available_within_premises CHAR(1),
    toilet_functionl CHAR(1),
    toilet_running_water_available CHAR(1),
    toilet_tap_available CHAR(1),
    toilet_child_friendly CHAR(1),
    toilet_within_or_outside CHAR(1),
    date_of_construction DATE,
    source_of_fund_construction_id VARCHAR(2),
    awc_seperate_store_room CHAR(1),
    store_room_structure_id VARCHAR(2),
    kitchen_description_id VARCHAR(2),
    kitchen_seperate CHAR(1),
    kitchen_shed_condition_id CHAR(1),
    awc_utensil CHAR(1),
    user_id VARCHAR(15),
    log_dt DATE,
    PRIMARY KEY (project_id, awc_id)
);

-- Table: icds_inspection
CREATE TABLE icds_inspection (
    awc_id VARCHAR(4) NOT NULL,
    awc_inspection_date DATE NOT NULL,
    no_of_children_age_gro_6m_6y INTEGER,
    no_of_pregnent_women INTEGER,
    no_of_lactating_mother INTEGER,
    no_of_adolescent_girl INTEGER,
    growth_chart_avl CHAR(1),
    SUW_chieldren CHAR(1),
    awc_own_building CHAR(1),
    electricity_connection_available CHAR(1),
    awc_toilet_available CHAR(1),
    toilet_fit_for_house CHAR(1),
    awc_own_drinking_water_source CHAR(1),
    water_installation_type_id VARCHAR(2),
    water_source_id VARCHAR(2),
    diet_chart_displayed CHAR(1),
    coocked_as_per_diet_chart CHAR(1),
    brand_mustered_oil_id VARCHAR(2),
    brand_iodized_salt_id VARCHAR(2),
    musur_dal_small_grain CHAR(1),
    feed_grain_store_in_container CHAR(1),
    food_item_correct_stock CHAR(1),
    kitchen_shed_seperate CHAR(1),
    lpg_connection_available CHAR(1),
    kitchen_is_clean CHAR(1),
    store_room_condition_id VARCHAR(2),
    stock_of_rice_last VARCHAR(2),
    stock_of_musur_dal_last_id VARCHAR(2),
    chieldren_spot_fed INTEGER,
    women_spot_feeding INTEGER,
    awc_sishu_aloy CHAR(1),
    theme_based_ECCE CHAR(1),
    supushti_diwas_in_last_6_months INTEGER,
    register_found CHAR(1),
    annaprasan_divas_celebrated CHAR(1),
    higher_official_visit_last_6_months INTEGER,
    supervisor_visit INTEGER,
    remarks VARCHAR(100),
    PRIMARY KEY (awc_id, awc_inspection_date)
);

-- Table: icds_inspection_visitor
CREATE TABLE icds_inspection_visitor (
    visitor_id VARCHAR(4) NOT NULL,
    project_id VARCHAR(4) NOT NULL,
    awc_id VARCHAR(4) NOT NULL,
    awc_open CHAR(1),
    aww_id VARCHAR(4) NOT NULL,
    awh_id VARCHAR(4) NOT NULL,
    aww_present CHAR(1),
    awh_present CHAR(1),
    aww_mobile CHAR(10),
    PRIMARY KEY (visitor_id, project_id, awc_id, aww_id, awh_id)
);

-- Table: kitchen_description
CREATE TABLE kitchen_description (
    kitchen_description_id VARCHAR(2) NOT NULL,
    kitchen_description_description VARCHAR(50),
    PRIMARY KEY (kitchen_description_id)
);

-- Table: kitchen_shed_condition
CREATE TABLE kitchen_shed_condition (
    kitchen_shed_condition_id VARCHAR(2) NOT NULL,
    kitchen_shed_condition_description VARCHAR(50),
    PRIMARY KEY (kitchen_shed_condition_id)
);

-- Table: master_awc
CREATE TABLE master_awc (
    awc_id VARCHAR(4) NOT NULL,
    awc_name VARCHAR(50),
    awc_mobile CHAR(10),
    awc_aadhar_verified CHAR(1),
    awc_aadhar_no CHAR(12),
    PRIMARY KEY (awc_id)
);

-- Table: master_awh
CREATE TABLE master_awh (
    awh_id VARCHAR(4),
    awh_name VARCHAR(50)
);

-- Table: master_aww
CREATE TABLE master_aww (
    aww_id VARCHAR(4) NOT NULL,
    aww_name VARCHAR(50),
    aww_mobile CHAR(10),
    aww_aadhar_verified CHAR(1),
    aww_aadhar_no CHAR(12),
    PRIMARY KEY (aww_id)
);

-- Table: master_building_ownership
CREATE TABLE master_building_ownership (
    building_ownership_id VARCHAR(2),
    building_ownership_description VARCHAR(30)
);

-- Table: master_building_structure_type
CREATE TABLE master_building_structure_type (
    building_structure_type_id VARCHAR(1) NOT NULL,
    building_structure_type_description VARCHAR(50),
    PRIMARY KEY (building_structure_type_id)
);

-- Table: master_building_type
CREATE TABLE master_building_type (
    building_type_id VARCHAR(2) NOT NULL,
    building_type_description VARCHAR(50),
    PRIMARY KEY (building_type_id)
);

-- Table: master_drinking_water_facility
CREATE TABLE master_drinking_water_facility (
    drinking_water_facility_id VARCHAR(2),
    drinking_water_facility_description VARCHAR(50)
);

-- Table: master_drinking_water_source_type
CREATE TABLE master_drinking_water_source_type (
    drinking_water_source_type_id VARCHAR(2) NOT NULL,
    drinking_water_source_type_description VARCHAR(50),
    PRIMARY KEY (drinking_water_source_type_id)
);

-- Table: master_health_centre_distance
CREATE TABLE master_health_centre_distance (
    health_centre_distance_id VARCHAR(1),
    health_centre_distance_description VARCHAR(30)
);

-- Table: master_master_source_of_fund_construction
CREATE TABLE master_master_source_of_fund_construction (
    source_of_fund_construction_id VARCHAR(2) NOT NULL,
    source_of_fund_construction_description VARCHAR(50),
    PRIMARY KEY (source_of_fund_construction_id)
);

-- Table: master_outside_water_source
CREATE TABLE master_outside_water_source (
    outside_water_source_id VARCHAR(2) NOT NULL,
    outside_water_source_description VARCHAR(50),
    PRIMARY KEY (outside_water_source_id)
);

-- Table: master_project
CREATE TABLE master_project (
    project_id VARCHAR(4) NOT NULL,
    project_name VARCHAR(100),
    PRIMARY KEY (project_id)
);

-- Table: master_scheme
CREATE TABLE master_scheme (
    scheme_id VARCHAR(2) NOT NULL,
    scheme_description VARCHAR(50),
    PRIMARY KEY (scheme_id)
);

-- Table: master_source_of_fund
CREATE TABLE master_source_of_fund (
    source_of_fund_id VARCHAR(2),
    source_of_fund_description VARCHAR(50)
);

-- Table: master_store_room_condition
CREATE TABLE master_store_room_condition (
    store_room_condition_id VARCHAR(2) NOT NULL,
    store_room_condition_description VARCHAR(50),
    PRIMARY KEY (store_room_condition_id)
);

-- Table: master_store_room_structure
CREATE TABLE master_store_room_structure (
    store_room_structure_id VARCHAR(2) NOT NULL,
    store_room_structure_description VARCHAR(50),
    PRIMARY KEY (store_room_structure_id)
);

-- Table: master_toilet_condition
CREATE TABLE master_toilet_condition (
    toilet_condition_id VARCHAR(2),
    toilet_condition_description VARCHAR(50)
);

-- Table: master_toilet_structure
CREATE TABLE master_toilet_structure (
    toilet_structure_id VARCHAR(2) NOT NULL,
    toilet_structure_description VARCHAR(50),
    PRIMARY KEY (toilet_structure_id)
);

-- Table: master_toilet_type
CREATE TABLE master_toilet_type (
    toilet_type_id VARCHAR(2) NOT NULL,
    toilet_type_description VARCHAR(50),
    PRIMARY KEY (toilet_type_id)
);

-- Table: master_visitor
CREATE TABLE master_visitor (
    visitor_id VARCHAR(4) NOT NULL,
    visitor_name VARCHAR(50),
    designation_id VARCHAR(3),
    PRIMARY KEY (visitor_id)
);

-- Table: master_water_source_from_awc
CREATE TABLE master_water_source_from_awc (
    water_source_from_awc_id VARCHAR(2) NOT NULL,
    water_source_from_awc_description VARCHAR(50),
    PRIMARY KEY (water_source_from_awc_id)
);
