package com.example.caution.domain;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CautionQa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qa_id")
    private Long qaId;

    @Column(name = "chain_type", length = 100)
    private String chainType;

    @Column(name = "qa_goods_class", length = 100)
    private String qaGoodsClass;

    @Column(name = "qa_goods_type", length = 200)
    private String qaGoodsType;

    @Column(name = "qa_common_caution", columnDefinition = "TEXT")
    private String qaCommonCaution;

    @Column(name = "qa_detail_caution", columnDefinition = "TEXT")
    private String qaDetailCaution;

    @Column(name = "is_visible", length = 1)
    private String isVisible;

    @Column(name = "branch_id")
    private Integer branchId;  // branch가 다른 테이블과 연동될 경우, 이후 @ManyToOne 가능
}
