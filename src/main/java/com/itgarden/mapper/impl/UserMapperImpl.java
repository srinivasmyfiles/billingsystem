package com.itgarden.mapper.impl;

import com.itgarden.dto.AddressDTO;
import com.itgarden.dto.RoleDTO;
import com.itgarden.dto.UserDTO;
import com.itgarden.entity.Address;
import com.itgarden.entity.Role;
import com.itgarden.entity.User;
import com.itgarden.mapper.UserMapper;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-02T21:19:55+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User dtoToUser(UserDTO UsertDto) {
        if ( UsertDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( UsertDto.getId() );
        user.setEmailId( UsertDto.getEmailId() );
        user.setFirstName( UsertDto.getFirstName() );
        user.setPassword( UsertDto.getPassword() );
        user.setMiddleName( UsertDto.getMiddleName() );
        user.setLastName( UsertDto.getLastName() );
        user.setMobileNo( UsertDto.getMobileNo() );
        user.setAddressList( addressDTOListToAddressList( UsertDto.getAddressList() ) );
        user.setRoles( roleDTOListToRoleList( UsertDto.getRoles() ) );

        return user;
    }

    @Override
    public UserDTO userToDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setEmailId( user.getEmailId() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setMiddleName( user.getMiddleName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setMobileNo( user.getMobileNo() );
        userDTO.setAddressList( addressListToAddressDTOList( user.getAddressList() ) );
        userDTO.setRoles( roleListToRoleDTOList( user.getRoles() ) );

        return userDTO;
    }

    protected Address addressDTOToAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setAddress1( addressDTO.getAddress1() );
        address.setAddress2( addressDTO.getAddress2() );
        address.setCity( addressDTO.getCity() );
        address.setState( addressDTO.getState() );
        address.setCountry( addressDTO.getCountry() );
        address.setLandmark( addressDTO.getLandmark() );
        address.setMobile( addressDTO.getMobile() );

        return address;
    }

    protected List<Address> addressDTOListToAddressList(List<AddressDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Address> list1 = new ArrayList<Address>( list.size() );
        for ( AddressDTO addressDTO : list ) {
            list1.add( addressDTOToAddress( addressDTO ) );
        }

        return list1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );
        role.setDescription( roleDTO.getDescription() );

        return role;
    }

    protected List<Role> roleDTOListToRoleList(List<RoleDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Role> list1 = new ArrayList<Role>( list.size() );
        for ( RoleDTO roleDTO : list ) {
            list1.add( roleDTOToRole( roleDTO ) );
        }

        return list1;
    }

    protected AddressDTO addressToAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setAddress1( address.getAddress1() );
        addressDTO.setAddress2( address.getAddress2() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setState( address.getState() );
        addressDTO.setCountry( address.getCountry() );
        addressDTO.setLandmark( address.getLandmark() );
        addressDTO.setMobile( address.getMobile() );

        return addressDTO;
    }

    protected List<AddressDTO> addressListToAddressDTOList(List<Address> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressDTO> list1 = new ArrayList<AddressDTO>( list.size() );
        for ( Address address : list ) {
            list1.add( addressToAddressDTO( address ) );
        }

        return list1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setDescription( role.getDescription() );

        return roleDTO;
    }

    protected List<RoleDTO> roleListToRoleDTOList(List<Role> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleDTO> list1 = new ArrayList<RoleDTO>( list.size() );
        for ( Role role : list ) {
            list1.add( roleToRoleDTO( role ) );
        }

        return list1;
    }
}
