/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.user.asset.RealEstate;
import com.creditcloud.model.user.asset.RealEstateRecord;
import com.creditcloud.model.user.asset.Vehicle;
import com.creditcloud.model.user.asset.VehicleRecord;
import com.creditcloud.model.user.credit.Proof;
import java.util.List;
import javax.ejb.Remote;

/**
 * service handle asset related to user, only real estate and vehicle is
 * considered now
 *
 * @author rooseek
 */
@Remote
public interface UserAssetService {

    /**
     *
     * @param clientCode
     * @param estateId
     * @return
     */
    public RealEstate getRealEstateById(String clientCode, String estateId);

    /**
     *
     * @param clientCode
     * @param estate
     * @param addedBy
     * @param source
     * @param proof
     * @return
     */
    public RealEstate addRealEstate(String clientCode, RealEstate estate, Proof... proof);

    /**
     *
     * @param clientCode
     * @param estate
     * @param modifiedBy
     * @param source
     * @return
     */
    public boolean updateRealEstate(String clientCode, RealEstate estate);

    /**
     *
     * @param clientCode
     * @param estateId
     * @param proof
     * @return
     */
    public boolean addProofForRealEstate(String clientCode, String estateId, Proof... proof);

    /**
     *
     * @param clientCode
     * @param estateId
     * @return
     */
    public List<Proof> listProofByRealEstate(String clientCode, String estateId);

    /**
     * list real estate by user
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public List<RealEstate> listRealEstateByUser(String clientCode, String userId);

    /**
     *
     * @param clientCode
     * @param estateId
     * @return
     */
    public List<RealEstateRecord> listRecordByRealEstate(String clientCode, String estateId);

    /**
     *
     * @param clientCode
     * @param vehicleId
     * @return
     */
    public Vehicle getVehicleById(String clientCode, String vehicleId);

    /**
     *
     * @param clientCode
     * @param vehicle
     * @return
     */
    public Vehicle addVehicle(String clientCode, Vehicle vehicle, Proof... proof);

    /**
     *
     * @param clientCode
     * @param vehicle
     * @return
     */
    public boolean updateVehicle(String clientCode, Vehicle vehicle);

    /**
     *
     * @param clientCode
     * @param vehicleId
     * @param proof
     * @return
     */
    public boolean addProofFroVehicle(String clientCode, String vehicleId, Proof... proof);

    /**
     *
     * @param clientCode
     * @param vehicleId
     * @return
     */
    public List<Proof> listProofByVehicle(String clientCode, String vehicleId);

    /**
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public List<Vehicle> listVehicleByUser(String clientCode, String userId);

    /**
     *
     * @param clientCode
     * @param vehicleId
     * @return
     */
    public List<VehicleRecord> listRecordByVehicle(String clientCode, String vehicleId);
}
