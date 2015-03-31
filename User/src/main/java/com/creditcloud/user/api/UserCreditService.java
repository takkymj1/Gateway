/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.api;

import com.creditcloud.model.user.credit.Certificate;
import com.creditcloud.model.user.credit.CertificateRecord;
import com.creditcloud.model.user.credit.Proof;
import com.creditcloud.model.user.credit.UserCredit;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.ProofContentType;
import com.creditcloud.model.enums.user.credit.ProofType;
import com.creditcloud.model.misc.RealmEntity;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserCreditService {

    /**
     * get UserCredit by userId
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public UserCredit getUserCreditByUserId(String clientCode, String userId);

    /**
     * get user certificate by userId and certificate type
     *
     * @param clientCode
     * @param userId
     * @param type
     * @return
     */
    public Certificate getCertificateByUserByType(String clientCode, String userId, CertificateType type);

    /**
     * get Certificate by its id
     *
     * @param clientCode
     * @param certificateId
     * @return
     */
    public Certificate getCertificateById(String clientCode, String certificateId);

    /**
     * add Proof for user
     *
     * @param clientCode
     * @param userId
     * @param proof
     * @return
     */
    public Proof addProof(String clientCode, String userId, Proof proof);

    /**
     * 为某一认证类型，添加Proof
     * 
     * 该认证与用户无关（如对保险、基金的认证），且此认证类型在平台内应只存在一个，此类Proof通过owner/proofType/contentType/content/ 保证唯一性</p>
     * Proof的owner再针对具体的基金或保险产品
     * @param clientCode
     * @param proof
     * @return 
     */
    public Proof addProof(String clientCode, Proof proof);
    
    /**
     * delete proof by id
     *
     * @param clientCode
     * @param proofId
     * @return
     */
    public boolean deleteProof(String clientCode, String proofId);

    /**
     * owner为proof关联的RealmEntity,如果不为null,则将此proof设为cover,其他proof设置为非cover</p>
     * 如果为null，则只将此proof设为cover,那么可能导致同一RealmEntity对应proof中有多个cover</p>
     *
     * @param clientCode
     * @param userId
     * @param owner
     * @param proofId
     */
    public void markProofAsCover(String clientCode, String userId, RealmEntity owner, String proofId);

    /**
     * get cover proof
     *
     * @param clientCode
     * @param userId
     * @param owner
     * @return all proof that set be cover
     */
    public List<Proof> getCoverProof(String clientCode, String userId, RealmEntity owner);

    /**
     * get proof by user and content
     *
     * @param clientCode
     * @param userId
     * @param owner
     * @param proofType
     * @param contentType
     * @param content
     * @return
     */
    public Proof getProofByUserAndContent(String clientCode,
                                          String userId,
                                          RealmEntity owner,
                                          ProofType proofType,
                                          ProofContentType contentType,
                                          String content);

    /**
     * delete proof by user and content
     *
     * @param clientCode
     * @param userId
     * @param owner
     * @param proofType
     * @param contentType
     * @param content
     * @return
     */
    public boolean deleteProofByUserAndContent(String clientCode,
                                               String userId,
                                               RealmEntity owner,
                                               ProofType proofType,
                                               ProofContentType contentType,
                                               String content);

    /**
     * list proof by certificate type and user id
     *
     * @param clientCode
     * @param userId
     * @param certificateTypes
     * @param contentTypes
     * @return
     */
    public List<Proof> listProofByUserAndType(String clientCode, String userId, List<CertificateType> certificateTypes, List<ProofContentType> contentTypes);

    /**
     * list proof by user/owner and proofType
     *
     * @param clientCode
     * @param userId
     * @param owner
     * @param proofTypes
     * @return
     */
    public List<Proof> listProofByUserAndProofType(String clientCode, String userId, RealmEntity owner, List<ProofType> proofTypes);

    /**
     * list proof by user and proofType
     *
     * @param clientCode
     * @param userId
     * @param proofTypes
     * @return
     */
    public List<Proof> listProofByUserAndProofType(String clientCode, String userId, List<ProofType> proofTypes);

    /**
     * 列出用户关于某贷款请求的proof
     *
     * @param clientCode
     * @param userId
     * @param requestId
     * @param contentType
     * @return
     */
    public List<Proof> listProofByLoanRequestAndType(String clientCode, String userId, String requestId, ProofContentType... contentType);

    /**
     * 列出某个用户名下某个entity的proof</p>
     * 是上面方法的通用版本
     *
     * @param clientCode
     * @param userId
     * @param entity
     * @param contentType
     * @return
     */
    public List<Proof> listProofByEntityAndType(String clientCode, String userId, RealmEntity entity, ProofContentType... contentType);

    /**
     * 根据owner/contentType列出proof
     *
     * @param clientCode
     * @param owner
     * @param contentType
     * @return
     */
    public List<Proof> listProofByOwnerAndType(String clientCode, RealmEntity owner, ProofContentType... contentType);
    
    /**
     * list all certificate for a user
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public List<Certificate> listCertificateByUser(String clientCode, String userId);

    /**
     * list all certificate records for a certificate
     *
     * @param clientCode
     * @param certificateId
     * @return
     */
    @Deprecated
    public List<CertificateRecord> listRecordByCertificate(String clientCode, String certificateId);

    /**
     * 更新认证，而且所有的更新记录都被保存下来
     *
     * @param clientCode
     * @param certificate
     * @return
     */
    public boolean updateCertificate(String clientCode, Certificate certificate);

    /**
     * 更新信用信息
     *
     * @param clientCode
     * @param credit
     * @return
     */
    public boolean updateUserCredit(String clientCode, UserCredit credit);
    
    /**
     * 删除proof，方法用于非认证信息删除关联图片或文档，删除认证类图片（文档）请调用deleteProof
     * @param clientCode
     * @param proofId
     * @return 
    */
    public boolean deleteProofNoCertificate(String clientCode , String proofId);
}
