package com.itgarden.mapper;

import com.itgarden.dto.CustomerDTO;
import com.itgarden.dto.UserDTO;
import com.itgarden.dto.VendorDTO;
import com.itgarden.entity.Customer;
import com.itgarden.entity.User;
import com.itgarden.entity.Vendor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);
    Vendor dtoToVendor(VendorDTO vendorDTO);
    @InheritInverseConfiguration
    VendorDTO vendorToDTO(Vendor vendor);


}
