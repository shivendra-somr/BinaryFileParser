meta:
  id:  farm_log_page
  endian: be
  bit-endian: be
  
seq:
  - id: template_335_seagate_farm_log_ds
    type: b1
    doc: |
      Disable save bit status: should be 1 as this page is NOT savable to disc.Disable save bit status: should be 1 as this page is NOT savable to disc.
  - id: template_335_seagate_farm_log_spf
    type: b1
    doc: |
      Subpage Format: should be 1 as FARM Log is implemented as a subpages 0x03 and 0x04 of Logpage 0x3D.
  - id: template_335_seagate_farm_log_page_code
    type: b6
    doc: |
      Extracted Page Code (bit 5 to bit 0 of byte 0)
  - id: template_335_seagate_sub_page_code
    type: u1
    doc: |
      Subpage 0x03 for current FARM data and Subpage 0x04 for factory FARM data.
  - id: template_335_seagate_page_length
    type: u2
    doc: |
      Page Length
  - id: template_335_seagate_farm_log_parameters
    type: log_parameters
    repeat: expr
    repeat-expr: 1
    doc: |
      FARM Logpage log parameters

types:
  log_parameters:
    seq:
      - id: header_parameter
        type: header_parameter
      - id: general_drive_information_parameter
        type: general_drive_information_parameter
      - id: workload_statistics_parameter
        type: workload_statistics_parameter
      - id: error_statistics_parameter
        type: error_statistics_parameter
      - id: environmental_statistics_parameter
        type: environmental_statistics_parameter
      - id: reliability_statistics_parameter
        type: reliability_statistics_parameter
  header_parameter:
    seq:
      - id: parameter_code
        type: u2
        doc: |
          Parameter Code : 0x00 (byte 0-1)
      - id: parameter_control_byte
        type: u1
        doc: |
          Parameter Control Byte: 0x03 (byte 2)
      - id: prameter_length
        type: u1
        doc: |
          Prameter Length: 64 (byte 3)
      - id: log_signature
        type: log_signature
        doc: |
          Log Signature : 0xC0004641524D4552
      - id: log_major_revision
        type: log_major_revision
        doc: |
          Log Major Signature : 0xC000000000000003
      - id: log_minor_revision
        type: log_minor_revision
        doc: |
          Log Minor Signature : 0xC000000000000007
      - id: number_of_log_parameters_supported
        type: number_of_log_parameters_supported
        doc: |
          Number of Log Parameters supported : 0xC000000000000028      
      - id: log_page_size_in_bytes
        type: log_page_size_in_bytes
        doc: |
          Log Page Size in Bytes : 0xC000000000001784 = 6020
      - id: reserved_byte_44_to_51
        type: str
        size: 8
        encoding: ASCII
        doc: |
          Reserved bytes
      - id: maximum_drive_heads_supported
        type: maximum_drive_heads_supported
        doc: |
          Maximum Drive Heads Supported : 0x12 = 18
      - id: reserved_byte_60_to_67
        type: str
        size: 8
        encoding: ASCII
        doc: |
          Reserved bytes
      
  log_signature:
    seq:
      - id: status_byte
        type: status_byte
      - id: log_signature_value
        type: str
        size: 7
        encoding: ASCII
  
  log_major_revision:
    seq:
      - id: status_byte
        type: status_byte
      - id: log_major_revision_value
        type: str
        size: 7
        encoding: UTF-8
  log_minor_revision:
    seq:
      - id: status_byte
        type: status_byte
      - id: log_minor_revision_value
        type: str
        size: 7
        encoding: UTF-8
  number_of_log_parameters_supported:
    seq: 
      - id: status_byte
        type: status_byte
      - id: number_of_log_parameters_supported_value
        type: str
        size: 7
        encoding: UTF-8
  log_page_size_in_bytes:
    seq:
      - id: status_byte
        type: status_byte
      - id: log_page_size_in_bytes_value
        type: str
        size: 7
        encoding: UTF-8
  maximum_drive_heads_supported:
    seq:
      - id: status_byte
        type: status_byte
      - id: maximum_drive_heads_supported_value
        type: str
        size: 7
        encoding: UTF-8
  general_drive_information_parameter:
    seq:
      - id: common_parameter
        type: log_parameter_common
      - id: gdpr_info
        type: str
        size: 32
        encoding: ASCII
      - id: device_interface
        type: device_interface
      - id: device_capacity
        type: device_capacity
      - id: physical_sector_size
        type: physical_sector_size
      - id: logical_sector_size
        type: logical_sector_size
      - id: device_buffer_size
        type: device_buffer_size
      - id: number_of_heads
        type: number_of_heads
      - id: device_form_factor
        type: device_form_factor
      - id: rotational_rate_of_device
        type: rotational_rate_of_device
      - id: firmware_revision
        type: firmware_revision
      - id: reserved_132_to_155
        type: str
        size: 24
        encoding: ASCII
      - id: power_on_hours
        type: power_on_hours
      - id: reserved_164_to_187
        type: str
        size: 24
        encoding: ASCII
      - id: power_cycle_count
        type: power_cycle_count
      - id: hardware_reset_count
        type: hardware_reset_count
      - id: reserved_204_to_211
        type: str
        size: 8
        encoding: ASCII
      - id: nvc_status_on_power_on
        type: nvc_status_on_power_on
      - id: time_available_to_save_user_data
        type: time_available_to_save_user_data
      - id: timestamp_of_first_smart_summary
        type: timestamp_of_first_smart_summary
      - id: timestamp_of_last_smart_summary
        type: timestamp_of_last_smart_summary
         
  device_interface:
    seq:
      - id: status_byte
        type: status_byte
      - id: device_interface
        type: str
        size: 7
        encoding: ASCII
  device_capacity:
    seq:
      - id: status_byte
        type: status_byte
      - id: device_capacity
        type: str
        size: 7
        encoding: UTF-8
  physical_sector_size:
    seq:
      - id: status_byte
        type: status_byte
      - id: physical_sector_size
        type: str
        size: 7
        encoding: UTF-8
  logical_sector_size:
    seq:
      - id: status_byte
        type: status_byte
      - id: logical_sector_size
        type: str
        size: 7
        encoding: UTF-8
  device_buffer_size:
    seq:
      - id: status_byte
        type: status_byte
      - id: device_buffer_size
        type: str
        size: 7
        encoding: UTF-8
  number_of_heads:
    seq:
      - id: status_byte
        type: status_byte
      - id: number_of_heads
        type: str
        size: 7
        encoding: UTF-8
  device_form_factor:
    seq:
      - id: status_byte
        type: status_byte
      - id: device_form_factor
        type: str
        size: 7
        encoding: UTF-8
  rotational_rate_of_device:
    seq:
      - id: status_byte
        type: status_byte
      - id: rotational_rate_of_device
        type: str
        size: 7
        encoding: UTF-8
  firmware_revision:
    seq:
      - id: status_byte
        type: status_byte
      - id: firmware_revision
        type: str
        size: 15
        encoding: ASCII
  power_on_hours:
    seq:
      - id: status_byte
        type: status_byte
      - id: power_on_hours
        type: str
        size: 7
        encoding: UTF-8
  power_cycle_count:
    seq:
      - id: status_byte
        type: status_byte
      - id: power_cycle_count
        type: str
        size: 7
        encoding: UTF-8
  hardware_reset_count:
    seq:
      - id: status_byte
        type: status_byte
      - id: hardware_reset_count
        type: str
        size: 7
        encoding: UTF-8
  nvc_status_on_power_on:
    seq:
      - id: status_byte
        type: status_byte
      - id: nvc_status_on_power_on
        type: str
        size: 7
        encoding: UTF-8
  time_available_to_save_user_data:
    seq:
      - id: status_byte
        type: status_byte
      - id: time_available_to_save_user_data
        type: str
        size: 7
        encoding: UTF-8
  timestamp_of_first_smart_summary:
    seq:
      - id: status_byte
        type: status_byte
      - id: timestamp_of_first_smart_summary
        type: str
        size: 7
        encoding: UTF-8
  timestamp_of_last_smart_summary:
    seq:
      - id: status_byte
        type: status_byte
      - id: timestamp_of_last_smart_summary
        type: str
        size: 7
        encoding: UTF-8
  workload_statistics_parameter:
    seq:
      - id: common_parameter
        type: log_parameter_common
      - id: rated_workload_percentage
        type: rated_workload_percentage
        doc: |
          Rated Workload Percentage (No longer Supported)
      - id: total_number_of_read_commmands
        type: total_number_of_read_commmands
        doc: |
          Total Number of Read Commands
      - id: total_number_of_write_commands
        type: total_number_of_write_commands
        doc: |
          Total Number of Write Commands
      - id: total_number_of_random_read_commands
        type: total_number_of_random_read_commands
        doc: |
          Total Number of Random Read Commands
      - id: total_number_of_random_write_commands
        type: total_number_of_random_write_commands
        doc: |
          Total Number of Random Write Commands
      - id: total_number_of_other_commands
        type: total_number_of_other_commands
        doc: |
          Total Number of Other Commands
      - id: logical_sectors_written
        type: logical_sectors_written
        doc: |
          Logical Sectors Written
      - id: logical_sectors_read
        type: logical_sectors_read
        doc: |
          Logical Sectord Read

  rated_workload_percentage:
    seq:
      - id: status_byte
        type: status_byte
      - id: rated_workload_percentage
        type: str
        size: 7
        encoding: UTF-8
  total_number_of_read_commmands:
    seq: 
      - id: status_byte
        type: status_byte
      - id: total_number_of_read_commmands
        type: str
        size: 7
        encoding: UTF-8
  total_number_of_write_commands:
    seq: 
      - id: status_byte
        type: status_byte
      - id: total_number_of_write_commands
        type: str
        size: 7
        encoding: UTF-8
  total_number_of_random_read_commands:
    seq: 
      - id: status_byte
        type: status_byte
      - id: total_number_of_random_read_commands
        type: str
        size: 7
        encoding: UTF-8
  total_number_of_random_write_commands:
    seq: 
      - id: status_byte
        type: status_byte
      - id: total_number_of_random_read_commands
        type: str
        size: 7
        encoding: UTF-8
  total_number_of_other_commands:
    seq: 
      - id: status_byte
        type: status_byte
      - id: total_number_of_other_commands
        type: str
        size: 7
        encoding: UTF-8
  logical_sectors_written:
    seq: 
      - id: status_byte
        type: status_byte
      - id: logical_sectors_written
        type: str
        size: 7
        encoding: UTF-8
  logical_sectors_read:
    seq: 
      - id: status_byte
        type: status_byte
      - id: logical_sectors_read
        type: str
        size: 7
        encoding: UTF-8
  error_statistics_parameter:
    seq:
      - id: common_parameter
        type: log_parameter_common
      - id: number_of_unrecoverable_read_errors_from_e_w_l_m
        type: number_of_unrecoverable_read_errors_from_e_w_l_m
      - id: number_of_unrecoverable_write_errors_from_e_w_l_m
        type: number_of_unrecoverable_write_errors_from_e_w_l_m
      - id: reserved_36_to_51
        type: str
        size: 16
        encoding: ASCII
      - id: number_of_mechanical_start_errors
        type: number_of_mechanical_start_errors
        doc: |
          Number of Mechanical Start Retries ( Log Page 0x06, PC 0xD110)
      - id: reserved_60_to_163
        type: str
        size: 104
        encoding: ASCII
      - id: f_r_u_code_if_smart_trip
        type: f_r_u_code_if_smart_trip
        doc: |
          FRU code if smart trip from most recent SMART Frame
      - id: invalid_d_word_count_port_a
        type: invalid_d_word_count_port_a
      - id: invalid_d_word_count_port_b
        type: invalid_d_word_count_port_b
  
  number_of_unrecoverable_read_errors_from_e_w_l_m:
    seq:
      - id: status_byte
        type: status_byte
      - id: number_of_unrecoverable_read_errors_from_e_w_l_m
        type: str
        size: 7
        encoding: UTF-8
  number_of_unrecoverable_write_errors_from_e_w_l_m:
    seq:
      - id: status_byte
        type: status_byte
      - id: number_of_unrecoverable_write_errors_from_e_w_l_m
        type: str
        size: 7
        encoding: UTF-8
  number_of_mechanical_start_errors:
    seq:
      - id: status_byte
        type: status_byte
      - id: number_of_mechanical_start_errors
        type: str
        size: 7
        encoding: UTF-8
  f_r_u_code_if_smart_trip:
    seq:
      - id: status_byte
        type: status_byte
      - id: f_r_u_code_if_smart_trip
        type: str
        size: 7
        encoding: UTF-8
  invalid_d_word_count_port_a:
    seq:
      - id: status_byte
        type: status_byte
      - id: invalid_d_word_count_port_a
        type: str
        size: 7
        encoding: UTF-8
  invalid_d_word_count_port_b:
    seq:
      - id: status_byte
        type: status_byte
      - id: invalid_d_word_count_port_b
        type: str
        size: 7
        encoding: UTF-8
  environmental_statistics_parameter:
    seq:
      - id: common_parameter
        type: log_parameter_common
      - id: current_temperature_in_celsius
        type: current_temperature_in_celsius
        doc: |
          Current Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
      - id: highest_temperature_in_celsius
        type: highest_temperature_in_celsius
        doc: |
          Highest Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
      - id: lowest_temperature_in_celsius
        type: lowest_temperature_in_celsius
        doc: |
          Lowest Temperature in Celsius (Lower 16 bits are a signed integer in units of 0.1C)
      - id: reserved_44_to_107
        type: str
        size: 64
        encoding: ASCII
      - id: specified_max_operating_temperature_in_celsius
        type: specified_max_operating_temperature_in_celsius
        doc: |
          Specified Max Operating Temperature in Celsius
      - id: specified_min_operating_temperature_in_celsius
        type: specified_min_operating_temperature_in_celsius
        doc: |
          Specified Min Operating Temperature in Celsius
      - id: reserved_124_to_139
        type: str
        size: 16
        encoding: ASCII
      - id: current_relative_humidity
        type: current_relative_humidity
        doc: |
          Current Relative Humidity (in units of .1%)
      - id: reserved_148_to_155
        type: str
        size: 8
        encoding: ASCII
      - id: current_motor_power
        type: current_motor_power
        doc: |
          Current Motor Power, value from most recent restricted time range data set.
      
  current_temperature_in_celsius:
    seq:
      - id: status_byte
        type: status_byte
      - id: current_temperature_in_celsius
        type: str
        size: 7
        encoding: UTF-8
  highest_temperature_in_celsius:
    seq:
      - id: status_byte
        type: status_byte
      - id: highest_temperature_in_celsius
        type: str
        size: 7
        encoding: UTF-8
  lowest_temperature_in_celsius:
    seq:
      - id: status_byte
        type: status_byte
      - id: lowest_temperature_in_celsius
        type: str
        size: 7
        encoding: UTF-8
  specified_max_operating_temperature_in_celsius:
    seq:
      - id: status_byte
        type: status_byte
      - id: specified_max_operating_temperature_in_celsius
        type: str
        size: 7
        encoding: UTF-8
  specified_min_operating_temperature_in_celsius:
    seq:
      - id: status_byte
        type: status_byte
      - id: specified_min_operating_temperature_in_celsius
        type: str
        size: 7
        encoding: UTF-8
  current_relative_humidity:
    seq:
      - id: status_byte
        type: status_byte
      - id: current_relative_humidity
        type: str
        size: 7
        encoding: UTF-8
  current_motor_power:
    seq:
      - id: status_byte
        type: status_byte
      - id: current_motor_power
        type: str
        size: 7
        encoding: UTF-8
  reliability_statistics_parameter:
    seq:
      - id: common_parameter
        type: log_parameter_common
      - id: reserved_20_to_123
        type: str
        size: 104
        encoding: ASCII
      - id: number_of_r_a_w_operations
        type: number_of_r_a_w_operations
        doc: |
          Number of RAW Operations
      - id: cummulative_lifetime_unrecoverable_read_errors
        type: cummulative_lifetime_unrecoverable_read_errors
        doc: |
          Cumulative Lifetime Unrecoverable Read errors due to Error Recovery Control (e.g. ERC timeout)
      - id: reserved_140_to_203
        type: str
        size: 64
        encoding: ASCII
      - id: helium_pressure_threshold_trip
        type: helium_pressure_threshold_trip
        doc: |
          Helium Pressure Threshold Trip (1 – trip 0 – no trip)
      - id: reserved_212_to_235
        type: str
        size: 24
        encoding: ASCII
  number_of_r_a_w_operations:
    seq:
      - id: status_byte
        type: status_byte
      - id: number_of_r_a_w_operations
        type: str
        size: 7
        encoding: UTF-8
  cummulative_lifetime_unrecoverable_read_errors:
    seq:
      - id: status_byte
        type: status_byte
      - id: cummulative_lifetime_unrecoverable_read_errors
        type: str
        size: 7
        encoding: UTF-8
  helium_pressure_threshold_trip:
    seq:
      - id: status_byte
        type: status_byte
      - id: helium_pressure_threshold_trip
        type: str
        size: 7
        encoding: UTF-8
  log_parameter_common:
    seq:
      - id: parameter_code
        type: u2
        doc: |
          Parameter Code : 0x02 (byte 0-1)
      - id: parameter_control_byte
        type: u1
        doc: |
          Parameter Control Byte: 0x03 (byte 2)
      - id: parameter_length
        type: u1
        doc: |
          Parameter Length: 80 (byte 3)
      - id: page_number
        type: page_number
      - id: copy_number
        type: copy_number
  page_number:
    seq:
      - id: status_byte
        type: status_byte
      - id: page_number_value
        type: str
        size: 7
        encoding: UTF-8
        doc: |
          Page NUmber = 1
  copy_number:
    seq:
      - id: status_byte
        type: status_byte
      - id: copy_number_value
        type: str
        size: 7
        encoding: UTF-8
        doc: |
          Copy Number = 1
  status_byte:
    seq:
      - id: field_supported
        type: b1
      - id: field_valid
        type: b1
      - id: reserved
        type: b6
     

