meta:
  id : n_v_m_e_id_controller
  endian: be
seq:
  - id: nvme101_pci_vendor_id
    type: u2le
  - id: nvme101_pci_subsystem_vendor_id
    type: u2le
  - id: nvme101_serial_number
    type: str
    size: 20
    encoding: ASCII    
  - id: nvme101_model_number
    type: str
    size: 40
    encoding: ASCII
  - id: nvme101_firmware_revision
    type: str
    size: 8
    encoding: ASCII
  - id: nvme101_recom_arbitration_burst
    type: u1
  - id: nvme101_ieee_oui_identifier
    type: str
    size: 3
    encoding: UTF-8
  - id: nvme101_cmi_capabilities
    type: nvme101_cmi_capabilities
  - id: nvme101_max_data_transfer_size
    type: u1
  - id: nvme101_controller_id
    type: u2le
  - id: nvme101_version
    type: u4le
  - id: nvme101_resume_latency
    type: u4le
  - id: nvme101_entry_latency
    type: u4le
  - id: nvme101_asynchronous_events_supported
    type: nvme101_asynchronous_events_supported
  - id: nvme101_controller_attributes
    type: nvme101_controller_attributes
  - id: nvme101_reserved_bytes100_to_111
    type: str
    size: 12
    encoding: ASCII
  - id: nvme101_f_g_u_id
    type: str
    size: 16
    encoding: ASCII
  - id: nvme101_reserved_bytes128_to_239
    type: str
    size: 112
    encoding: ASCII
  - id: nvme101_bytes_240_to_255
    type: str
    size: 16
    encoding: ASCII
  - id: nvme101_admin_command_support
    type: nvme101_admin_command_support
  - id: nvme101_abort_command_limit
    type: u1
  - id: nvme101_a_e_r_l
    type: u1
  - id: nvme101_firmware_updates
    type: nvme101_firmware_updates
  - id: nvme101_log_page_attributes
    type: nvme101_log_page_attributes
  - id: nvme101_error_log_page_entries
    type: u1
  - id: nvme101_number_of_power_states
    type: u1
  - id: nvme101_admin_command_config
    type: nvme101_admin_command_config
  - id: nvme101_power_state_transition
    type: nvme101_power_state_transition
  - id: nvme101_warning_temp_threshold
    type: u2le
  - id: nvme101_critical_temp_threshold
    type: u2le
  - id: nvme101_max_time_for_firmware_activation
    type: u2le
  - id: nvme101_host_memory_buffer_preferred
    type: u4le
  - id: nvme101_host_memory_buffer_minimum
    type: u4le
  - id: nvme101_total_nvm_capacity
    type: str
    size: 16
    encoding: UTF-8
  - id: nvme101_unallocates_nvm_capacity
    type: str
    size: 16
    encoding: UTF-8
  - id: nvme101_replay_protected_memory
    type: nvme101_replay_protected_memory
  - id: nvme101_extended_device_self_test_time
    type: u2le
  - id: nvme101_device_self_test_options
    type: nvme101_device_self_test_options
  - id: nvme101_firmware_update_granurality
    type: u1
  - id: nvme101_keep_alivae_support
    type: u2le
  - id: nvme101_host_controlled_attributes
    type: nvme101_host_controlled_attributes
  - id: nvme101_min_thermal_mgmt_temp
    type: u2le
  - id: nvme101_max_thermal_mgmt_temp
    type: u2le
  - id: nvme101_sanitize_capabilities
    type: nvme101_sanitize_capabilities
  - id: nvme101_reserved_bytes332_to_511
    type: str
    size: 180
    encoding: ASCII
  - id: nvme101_submission_query_entry_size
    type: nvme101_submission_query_entry_size
  - id: nvme101_completion_query_entry_size
    type: nvme101_completion_query_entry_size
  - id: nvme101_maximum_outstanding_commands
    type: u2le
  - id: nvme101_number_of_namespaces
    type: u4le
  - id: nvme101_optional_nvm_command
    type: nvme101_optional_nvm_command
  - id: nvme101_fused_operation_support
    type: nvme101_fused_operation_support
  - id: nvme101_format_nvm_attributes
    type: nvme101_format_nvm_attributes
  - id: nvme101_volatile_write_cache
    type: nvme101_volatile_write_cache
  - id: nvme101_atomic_write_unit_normal
    type: u2le
  - id: nvme101_atomic_write_unit_power_fail
    type: u2le
  - id: nvme101_nvm_vendor_specific_command_config
    type: nvme101_nvm_vendor_specific_command_config
  - id: nvme101_reserved_byte_531
    type: u1
  - id: nvme101_atomic_compare0_write_unit
    type: u2le
  - id: nvme101_reserved_bytes_534_to_535
    type: u2le
  - id: nvme101_s_g_l_support
    type: nvme101_s_g_l_support
  - id: nvme101_reserved_bytes540_to_767
    type: str
    size: 228
    encoding: ASCII
  - id: nvme101_nvm_subsystem_nvme_qualified_name
    type: str
    size: 256
    encoding: ASCII
  - id: nvme101_reserved_bytes1024_to_1791
    type: str
    size: 768
    encoding: ASCII
  - id: nvme101_fabric_specification
    type: str
    size: 256
    encoding: ASCII
  - id: nvme101_power_state_descriptor
    type: nvme101_power_state_descriptor
    repeat: expr
    repeat-expr: 32
  - id: nvme101_vendor_specific
    type: str
    size: 1024
    encoding: ASCII
types:
  nvme101_cmi_capabilities:
    seq:
      - id: nvme101_msbb7_to_3
        type: b5
      - id: nvme101_msbb2_associated
        type: b1
      - id: nvme101_msbb1_contain_controllers
        type: b1
      - id: nvme101_msbb0_contain_pci_express_ports
        type: b1
  nvme101_asynchronous_events_supported:
    seq:
      - id: nvme101_msbb0_to_7
        type: b8
      - id: nvme101_supports_namespace_attribute
        type: b1
      - id: nvme101_supports_firmware_activation
        type: b1
      - id: nvme101_msbb10_to_32
        type: b22
  nvme101_controller_attributes:
    seq:
      - id: nvme101_supports_host_identifier
        type: b1
      - id: nvme101_supports_permissive_mode
        type: b1
      - id: nvme101_msbb3_to32
        type: b30
  nvme101_admin_command_support:
    seq:
     - id: nvme101_supports_security
       type: b1
     - id: nvme101_supports_nvm_cmd
       type: b1
     - id: nvme101_supports_firmware_cmd
       type: b1
     - id: nvme101_supports_namespace_cmd
       type: b1
     - id: nvme101_supports_device_self_test_cmd
       type: b1
     - id: nvme101_supports_directives
       type: b1
     - id: nvme101_supports_nvme_m_i_cmd
       type: b1
     - id: nvme101_supports_virtualization
       type: b1
     - id: nvme101_supports_config_cmd
       type: b1
     - id: nvme101_reserved
       type: b7
  nvme101_firmware_updates:
    seq:
      - id: nvme101_reserved
        type: b3
      - id: nvme101_supports_activation_without_reset
        type: b1
      - id: nvme101_number_of_firmware_slots
        type: b3
      - id: nvme101_firmware_slot_read_only
        type: b1
  nvme101_log_page_attributes:
    seq:
      - id: nvme101_reserved
        type: b4
      - id: nvme101_supports_telemetry
        type: b1
      - id: nvme101_supports_extended_data
        type: b1
      - id: nvme101_supports_commands
        type: b1
      - id: nvme101_supports_health_info
        type: b1
  nvme101_admin_command_config:
    seq:
      - id: nvme101_reserved
        type: b7
      - id: nvme101_is_command_vendor_specific
        type: b1
  nvme101_power_state_transition:
    seq:
      - id: nvme101_reserved
        type: b7
      - id: nvme101_supports_power_state_transition
        type: b1
  nvme101_replay_protected_memory:
    seq:
      - id: nvme101_number_of_r_p_m_b_units
        type: b3
      - id: nvme101_authentication_method
        type: b3
      - id: nvme101_msbb6_to_15_reserved
        type: b10
      - id: nvme101_total_size
        type: u1
      - id: nvme101_access_size
        type: u1
  nvme101_device_self_test_options:
    seq:
      - id: nvme101_test_operations
        type: b1
      - id: nvme101_reserved
        type: b7
  nvme101_host_controlled_attributes:
    seq:
      - id: nvme101_supports_thermal_mgmt
        type: b1
      - id: nvme101_reserved
        type: b15
  nvme101_sanitize_capabilities:
    seq:
      - id: nvme101_crypto_erase
        type: b1
      - id: nvme101_block_erase
        type: b1
      - id: nvme101_overwrite_erase
        type: b1
      - id: nvme101_reserved
        type: b29
  nvme101_submission_query_entry_size:
    seq:
      - id: nvme101_required_size
        type: b4
      - id: nvme101_max_size
        type: b4
  nvme101_completion_query_entry_size:
    seq:
      - id: nvme101_required_size
        type: b4
      - id: nvme101_max_size
        type: b4
  nvme101_optional_nvm_command:
    seq:
      - id: nvme101_msbb7_reserved
        type: b1
      - id: nvme101_supports_timestamp_feature
        type: b1
      - id: nvme101_supports_reservations
        type: b1
      - id: nvme101_supports_save_field_command
        type: b1
      - id: nvme101_supports_write_zeroes_command
        type: b1
      - id: nvme101_supports_dataset_mgmt_command
        type: b1
      - id: nvme101_supports_write_uncorrectable_commands
        type: b1
      - id: nvme101_supports_compare_command
        type: b1
      - id: nvme101_msbb15_to_8_reserved
        type: b8
  nvme101_fused_operation_support:
    seq:
      - id: nvme101_msbb7_to_4_reserved
        type: b4
      - id: nvme101_msbb3_to_1_reserved
        type: b3
      - id: nvme101_msbb0_supports_compare_write
        type: b1
      - id: nvme101_msbb15_to_8_reserved
        type: b8
  nvme101_format_nvm_attributes:
    seq:
      - id: nvme101_msbb7_to_4_reserved
        type: b4
      - id: nvme101_msbb3_reserved
        type: b1
      - id: nvme101_supports_cryptographic_erase
        type: b1
      - id: nvme101_supports_crypto_erase_per_namespace
        type: b1
      - id: nvme101_supports_format_per_namespace
        type: b1
  nvme101_volatile_write_cache:
    seq:
      - id: nvme101_msbb7_to_4_reserved
        type: b4
      - id: nvme101_msbb3_to_1_reserved
        type: b3
      - id: nvme101_msbb0_supports_compare_write
        type: b1
  nvme101_nvm_vendor_specific_command_config:
    seq:
      - id: nvme101_msbb7_to_4_reserved
        type: b4
      - id: nvme101_msbb3_to_1_reserved
        type: b3
      - id: nvme101_is_vendor_specific_command_format
        type: b1
  nvme101_s_g_l_support:
    seq:
      - id: nvme101_reserved_msbb31_to_24
        type: b8
      - id: nvme101_reserved_msbb23_to_21
        type: b3
      - id: nvme101_is_address_field_specify_offset
        type: b1
      - id: nvme101_is_qword_aligned_supported
        type: b1
      - id: nvme101_is_sgl_length_equals
        type: b1
      - id: nvme101_is_physical_buffer_supported
        type: b1
      - id: nvme101_is_sgl_bit_bucket_descriptor_supported
        type: b1
      - id: nvme101_reserved_msbb15_to_3
        type: b13
      - id: nvme101_is_keyed_sgl_data_block
        type: b1
      - id: nvme101_is_sgl_supported
        type: b2
  nvme101_power_state_descriptor:
    seq:
      - id: nvme101_offset00_to_03
        type: nvme101_offset00_to_03
      - id: nvme101_enlat
        type: u4le
      - id: nvme101_exlat
        type: u4le
      - id: nvme101_offset12_to_15
        type: nvme101_offset12_to_15
      - id: nvme101_offset16_to_19
        type: nvme101_offset16_to_19
      - id: nvme101_offset20_to_23
        type: nvme101_offset20_to_23
      - id: nvme101_reserved
        type: u8
  nvme101_offset00_to_03:
    seq:
      - id: nvme101_mp
        type: u2le
      - id: nvme101_res1
        type: u1
      - id: nvme101_mps
        type: b1
      - id: nvme101_nops
        type: b1
      - id: nvme101_res2
        type: b2
      - id: nvme101_res3
        type: b4
  nvme101_offset12_to_15:
    seq:
      - id: nvme101_rrt
        type: u1
      - id: nvme101_rrl
        type: u1
      - id: nvme101_rwt
        type: u1
      - id: nvme101_rwl
        type: u1
  nvme101_offset16_to_19:
    seq:
      - id: nvme101_idlp
        type: u2le
      - id: nvme101_res1
        type: u1
      - id: nvme101_res2
        type: b2
      - id: nvme101_ips
        type: b2
      - id: nvme101_res3
        type: b4
  nvme101_offset20_to_23:
    seq: 
      - id: nvme101_acpt
        type: u2le
      - id: nvme101_apw
        type: b3
      - id: nvme101_res1
        type: b3
      - id: nvme101_aps
        type: b2
      - id: nvme101_res2
        type: u1
