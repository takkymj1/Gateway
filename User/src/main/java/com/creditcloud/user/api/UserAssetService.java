/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.misc.RealmEntity;
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
     * @param proof
     * @return
     */
    public RealEstate addRealEstate(String clientCode, RealEstate estate, Proof... proof);

    /**
     *
     * @param clientCode
     * @param estate
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
     * 根据关联的实体(如贷款申请)列出vehicle
     *
     * @param clientCode
     * @param owner
     * @return
     */
    public List<Vehicle> listVehicleByOwner(String clientCode, RealmEntity owner);

    /**
     *
     * @param clientCode
     * @param vehicleId
     * @return
     */
    public Vehicle getVehicleById(String clientCode, String vehicleId);

    /**
     * 根据user和车牌号获取vehicle
     *
     * @param clientCode
     * @userId
     * @param plateNumber
     * @return
     */
    public Vehicle getVehicleByUserAndPlateNumber(String clientCode, String userId, String plateNumber);

    /**
     *
     * @param clientCode
     * @param vehicle
     * @param proof
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
    public boolean addProofForVehicle(String clientCode, String vehicleId, Proof... proof);

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
