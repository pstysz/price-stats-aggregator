/**
 * WebApiServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.repositories.allegroApiClient;

import com.stats.aggregator.allegroobj.containers.*;
import com.stats.aggregator.allegroobj.contracts.*;

public class WebApiServiceBindingStub extends org.apache.axis.client.Stub implements WebApiServicePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[124];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddDescToItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest"), DoAddDescToItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse"));
        oper.setReturnClass(DoAddDescToItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddDescToItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"), DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"), DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse"));
        oper.setReturnClass(DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest"), DoAddToWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse"));
        oper.setReturnClass(DoAddToWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"), DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse"));
        oper.setReturnClass(DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest"), DoCancelBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse"));
        oper.setReturnClass(DoCancelBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest"), DoCancelRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse"));
        oper.setReturnClass(DoCancelRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarning");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundWarningRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest"), DoCancelRefundWarningRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse"));
        oper.setReturnClass(DoCancelRefundWarningResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundWarningResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest"), DoCancelTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse"));
        oper.setReturnClass(DoCancelTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"), DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"), DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse"));
        oper.setReturnClass(DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest"), DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest"), DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"), DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCreateItemTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest"), DoCreateItemTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse"));
        oper.setReturnClass(DoCreateItemTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCreateItemTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest"), DoFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse"));
        oper.setReturnClass(DoFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackManyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest"), DoFeedbackManyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse"));
        oper.setReturnClass(DoFeedbackManyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackManyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"), DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse"));
        oper.setReturnClass(DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest"), DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        oper.setReturnClass(DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetAdminUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest"), DoGetAdminUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse"));
        oper.setReturnClass(DoGetAdminUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetAdminUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetArchiveRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetArchiveRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest"), DoGetArchiveRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse"));
        oper.setReturnClass(DoGetArchiveRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetArchiveRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request"), DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response"));
        oper.setReturnClass(DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest"), DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest"), DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse"));
        oper.setReturnClass(DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"), DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse"));
        oper.setReturnClass(DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest"), DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest"), DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest"), DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse"));
        oper.setReturnClass(DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest"), DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse"));
        oper.setReturnClass(DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest"), DoGetFavouriteCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse"));
        oper.setReturnClass(DoGetFavouriteCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest"), DoGetFavouriteSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse"));
        oper.setReturnClass(DoGetFavouriteSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest"), DoGetFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse"));
        oper.setReturnClass(DoGetFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"), DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest"), DoGetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse"));
        oper.setReturnClass(DoGetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest"), DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse"));
        oper.setReturnClass(DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest"), DoGetItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse"));
        oper.setReturnClass(DoGetItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsImagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest"), DoGetItemsImagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse"));
        oper.setReturnClass(DoGetItemsImagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsImagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest"), DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        oper.setReturnClass(DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"), DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        oper.setReturnClass(DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMessageToBuyerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest"), DoGetMessageToBuyerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse"));
        oper.setReturnClass(DoGetMessageToBuyerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMessageToBuyerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest"), DoGetMyAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse"));
        oper.setReturnClass(DoGetMyAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest"), DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest"), DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest"), DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        oper.setReturnClass(DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest"), DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"), DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"), DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"), DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest"), DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"), DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest"), DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest"), DoGetMyPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse"));
        oper.setReturnClass(DoGetMyPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"), DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest"), DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        oper.setReturnClass(DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellRatingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest"), DoGetMySellRatingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        oper.setReturnClass(DoGetMySellRatingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellRatingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest"), DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest"), DoGetMyWatchItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse"));
        oper.setReturnClass(DoGetMyWatchItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWatchedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWatchedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest"), DoGetMyWatchedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse"));
        oper.setReturnClass(DoGetMyWatchedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWatchedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest"), DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest"), DoGetPaymentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse"));
        oper.setReturnClass(DoGetPaymentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest"), DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"), DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"), DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest"), DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"), DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest"), DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest"), DoGetRefundsDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        oper.setReturnClass(DoGetRefundsDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest"), DoGetRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse"));
        oper.setReturnClass(DoGetRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest"), DoGetRefundsReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse"));
        oper.setReturnClass(DoGetRefundsReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest"), DoGetRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse"));
        oper.setReturnClass(DoGetRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormAttribsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest"), DoGetSellFormAttribsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse"));
        oper.setReturnClass(DoGetSellFormAttribsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormAttribsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest"), DoGetSellFormFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse"));
        oper.setReturnClass(DoGetSellFormFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest"), DoGetSellFormFieldsExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse"));
        oper.setReturnClass(DoGetSellFormFieldsExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest"), DoGetSellFormFieldsExtLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse"));
        oper.setReturnClass(DoGetSellFormFieldsExtLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"), DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest"), DoGetSellFormFieldsLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse"));
        oper.setReturnClass(DoGetSellFormFieldsLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellRatingReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest"), DoGetSellRatingReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse"));
        oper.setReturnClass(DoGetSellRatingReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellRatingReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSessionHandleForWidgetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest"), DoGetSessionHandleForWidgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse"));
        oper.setReturnClass(DoGetSessionHandleForWidgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSessionHandleForWidgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest"), DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        oper.setReturnClass(DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataForRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest"), DoGetShipmentDataForRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse"));
        oper.setReturnClass(DoGetShipmentDataForRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataForRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest"), DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopsTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShopsTagsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest"), DoGetShopsTagsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse"));
        oper.setReturnClass(DoGetShopsTagsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShopsTagsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"), DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        oper.setReturnClass(DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest"), DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest"), DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest"), DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest"), DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        oper.setReturnClass(DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest"), DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse"));
        oper.setReturnClass(DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"), DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"), DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse"));
        oper.setReturnClass(DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest"), DoGetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse"));
        oper.setReturnClass(DoGetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest"), DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse"));
        oper.setReturnClass(DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest"), DoGetWaitingFeedbacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse"));
        oper.setReturnClass(DoGetWaitingFeedbacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest"), DoGetWaitingFeedbacksCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse"));
        oper.setReturnClass(DoGetWaitingFeedbacksCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest"), DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        oper.setReturnClass(DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest"), DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse"));
        oper.setReturnClass(DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginWithAccessTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest"), DoLoginWithAccessTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse"));
        oper.setReturnClass(DoLoginWithAccessTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginWithAccessTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request"), DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        oper.setReturnClass(DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest"), DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest"), DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse"));
        oper.setReturnClass(DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest"), DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        oper.setReturnClass(DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyContactRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest"), DoMyContactRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse"));
        oper.setReturnClass(DoMyContactResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyContactResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request"), DoMyFeedback2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response"));
        oper.setReturnClass(DoMyFeedback2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2LimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest"), DoMyFeedback2LimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse"));
        oper.setReturnClass(DoMyFeedback2LimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2LimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"), DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
        oper.setReturnClass(DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest"), DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest"), DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse"));
        oper.setReturnClass(DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest"), DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromWatchListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest"), DoRemoveFromWatchListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse"));
        oper.setReturnClass(DoRemoveFromWatchListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromWatchListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest"), DoRemoveItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse"));
        oper.setReturnClass(DoRemoveItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestCancelBidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest"), DoRequestCancelBidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse"));
        oper.setReturnClass(DoRequestCancelBidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestCancelBidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest"), DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        oper.setReturnClass(DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestSurchargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest"), DoRequestSurchargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse"));
        oper.setReturnClass(DoRequestSurchargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestSurchargeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"), DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        oper.setReturnClass(DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"), DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"), DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        oper.setReturnClass(DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest"), DoSendPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse"));
        oper.setReturnClass(DoSendPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest"), DoSendRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse"));
        oper.setReturnClass(DoSendRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest"), DoSetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse"));
        oper.setReturnClass(DoSetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest"), DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest"), DoSetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse"));
        oper.setReturnClass(DoSetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"), DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest"), DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        oper.setReturnClass(DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest"), DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        oper.setReturnClass(DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

    }

    public WebApiServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WebApiServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WebApiServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoAddDescToItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoAddDescToItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToWatchListRequest");
            cachedSerQNames.add(qName);
            cls = DoAddToWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToWatchListResponse");
            cachedSerQNames.add(qName);
            cls = DoAddToWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest");
            cachedSerQNames.add(qName);
            cls = DoCancelBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse");
            cachedSerQNames.add(qName);
            cls = DoCancelBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = DoCancelRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = DoCancelRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest");
            cachedSerQNames.add(qName);
            cls = DoCancelRefundWarningRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse");
            cachedSerQNames.add(qName);
            cls = DoCancelRefundWarningResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest");
            cachedSerQNames.add(qName);
            cls = DoCancelTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse");
            cachedSerQNames.add(qName);
            cls = DoCancelTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest");
            cachedSerQNames.add(qName);
            cls = DoCreateItemTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse");
            cachedSerQNames.add(qName);
            cls = DoCreateItemTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest");
            cachedSerQNames.add(qName);
            cls = DoFeedbackManyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse");
            cachedSerQNames.add(qName);
            cls = DoFeedbackManyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = DoFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = DoFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = DoGetAdminUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = DoGetAdminUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = DoGetArchiveRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = DoGetArchiveRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetFavouriteCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetFavouriteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest");
            cachedSerQNames.add(qName);
            cls = DoGetFavouriteSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse");
            cachedSerQNames.add(qName);
            cls = DoGetFavouriteSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = DoGetFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = DoGetFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = DoGetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = DoGetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetItemsImagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetItemsImagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMessageToBuyerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMessageToBuyerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMySellRatingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMySellRatingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchedItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyWatchedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchedItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyWatchedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWatchItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyWatchItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWatchItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyWatchItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPaymentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPaymentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetRefundsReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormAttribsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormAttribsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsExtLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsExtLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellFormFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSellRatingReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSellRatingReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSessionHandleForWidgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSessionHandleForWidgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentDataForRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentDataForRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetShopsTagsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetShopsTagsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = DoGetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = DoGetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest");
            cachedSerQNames.add(qName);
            cls = DoGetWaitingFeedbacksCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse");
            cachedSerQNames.add(qName);
            cls = DoGetWaitingFeedbacksCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest");
            cachedSerQNames.add(qName);
            cls = DoGetWaitingFeedbacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse");
            cachedSerQNames.add(qName);
            cls = DoGetWaitingFeedbacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest");
            cachedSerQNames.add(qName);
            cls = DoLoginWithAccessTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse");
            cachedSerQNames.add(qName);
            cls = DoLoginWithAccessTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest");
            cachedSerQNames.add(qName);
            cls = DoMyContactRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse");
            cachedSerQNames.add(qName);
            cls = DoMyContactResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest");
            cachedSerQNames.add(qName);
            cls = DoMyFeedback2LimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse");
            cachedSerQNames.add(qName);
            cls = DoMyFeedback2LimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request");
            cachedSerQNames.add(qName);
            cls = DoMyFeedback2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response");
            cachedSerQNames.add(qName);
            cls = DoMyFeedback2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromWatchListRequest");
            cachedSerQNames.add(qName);
            cls = DoRemoveFromWatchListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse");
            cachedSerQNames.add(qName);
            cls = DoRemoveFromWatchListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = DoRemoveItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = DoRemoveItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest");
            cachedSerQNames.add(qName);
            cls = DoRequestCancelBidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse");
            cachedSerQNames.add(qName);
            cls = DoRequestCancelBidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest");
            cachedSerQNames.add(qName);
            cls = DoRequestSurchargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse");
            cachedSerQNames.add(qName);
            cls = DoRequestSurchargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = DoSendPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = DoSendPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = DoSendRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = DoSendRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = DoSetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = DoSetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = DoSetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = DoSetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArchiveRefundsListTypeStruct");
            cachedSerQNames.add(qName);
            cls = ArchiveRefundsListTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfActiondatastruct");
            cachedSerQNames.add(qName);
            cls = ActionDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAddressinfostruct");
            cachedSerQNames.add(qName);
            cls = AddressInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfArchiverefundslisttypestruct");
            cachedSerQNames.add(qName);
            cls = ArchiveRefundsListTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArchiveRefundsListTypeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = AttribStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = BidItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = BidListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBillingdatatype");
            cachedSerQNames.add(qName);
            cls = BillingDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = BlackListResStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = BlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = CategoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = CategoryPathType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = CategoryTreeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = CatInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = CountryInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = DealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritescategoriesstruct");
            cachedSerQNames.add(qName);
            cls = FavouritesCategoriesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritessellersstruct");
            cachedSerQNames.add(qName);
            cls = FavouritesSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbacklist");
            cachedSerQNames.add(qName);
            cls = FeedbackList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackmanystruct");
            cachedSerQNames.add(qName);
            cls = FeedbackManyStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackresultstruct");
            cachedSerQNames.add(qName);
            cls = FeedbackResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = FieldsValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = FilterOptionsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = FiltersListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = FilterValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = FinishFailureStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = FinishItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = FutureItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = ItemBilling[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = ItemCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemgetimage");
            cachedSerQNames.add(qName);
            cls = ItemGetImage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = ItemImageList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagesstruct");
            cachedSerQNames.add(qName);
            cls = ItemImagesStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = ItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = ItemPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = ItemPriceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemreminderstruct");
            cachedSerQNames.add(qName);
            cls = ItemReminderStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemReminderStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemremovewatchstruct");
            cachedSerQNames.add(qName);
            cls = ItemRemoveWatchStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = ItemsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsnotaddedstruct");
            cachedSerQNames.add(qName);
            cls = ItemsNotAddedStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsNotAddedStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = ItemSurchargeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemtemplateliststruct");
            cachedSerQNames.add(qName);
            cls = ItemTemplateListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantattributestruct");
            cachedSerQNames.add(qName);
            cls = ItemVariantAttributeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantAttributeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantstruct");
            cachedSerQNames.add(qName);
            cls = ItemVariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = MyAccountStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMycontactlist");
            cachedSerQNames.add(qName);
            cls = MyContactList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyfeedbackliststruct2");
            cachedSerQNames.add(qName);
            cls = MyFeedbackListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNewpostbuyformsellerstruct");
            cachedSerQNames.add(qName);
            cls = NewPostBuyFormSellerStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = NotSoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = NotWonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = PackageInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = ParameterInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = PaymentDetailsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = PaymentItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = PaymentMethodStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = PaymentSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = PhotoInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = PostageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormForBuyersDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsstruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormItemDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormShipmentTrackingStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = PostBuyItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = PriceInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = ProductParametersGroupStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = ProductParametersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfReasoninfotype");
            cachedSerQNames.add(qName);
            cls = ReasonInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundlisttype");
            cachedSerQNames.add(qName);
            cls = RefundListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundsdealslisttype");
            cachedSerQNames.add(qName);
            cls = RefundsDealsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRelateditemstruct");
            cachedSerQNames.add(qName);
            cls = RelatedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellershipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = SellerShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = SellFormType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = SellItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragepermonthstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingAveragePerMonthStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = SellRatingAverageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingdetailstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingDetailStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingestimationstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingEstimationStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratinginfostruct");
            cachedSerQNames.add(qName);
            cls = SellRatingInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingReasonStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonsumstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingReasonSumStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingstatsstruct");
            cachedSerQNames.add(qName);
            cls = SellRatingStatsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = ShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct");
            cachedSerQNames.add(qName);
            cls = ShipmentPaymentInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = ShipmentPriceTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShopstagtypestruct");
            cachedSerQNames.add(qName);
            cls = ShopsTagTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShopsTagTypeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = SiteJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = SiteJournalDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = SoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = StateInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = StructSellAgain[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = StructSellFailed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = SysStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTagnamestruct");
            cachedSerQNames.add(qName);
            cls = TagNameStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = UserBlackListAddResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = UserBlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = UserIncomingPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = UserIncomingPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = UserPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = UserPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = UserPayoutStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = UserPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantquantitystruct");
            cachedSerQNames.add(qName);
            cls = VariantQuantityStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantstruct");
            cachedSerQNames.add(qName);
            cls = VariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWaitfeedbackstruct");
            cachedSerQNames.add(qName);
            cls = WaitFeedbackStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatcheditemstruct");
            cachedSerQNames.add(qName);
            cls = WatchedItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchedItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWatchitemstruct");
            cachedSerQNames.add(qName);
            cls = WatchItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = WonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            cachedSerQNames.add(qName);
            cls = CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            cachedSerQNames.add(qName);
            cls = ItemGetImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = ItemImagesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemReminderStruct");
            cachedSerQNames.add(qName);
            cls = ItemReminderStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct");
            cachedSerQNames.add(qName);
            cls = ItemRemoveWatchStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsNotAddedStruct");
            cachedSerQNames.add(qName);
            cls = ItemsNotAddedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = ItemVariantAttributeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = ItemVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            cachedSerQNames.add(qName);
            cls = MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsVariantStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormItemDealsVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            cachedSerQNames.add(qName);
            cls = ReasonInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            cachedSerQNames.add(qName);
            cls = RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            cachedSerQNames.add(qName);
            cls = SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShopsTagTypeStruct");
            cachedSerQNames.add(qName);
            cls = ShopsTagTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            cachedSerQNames.add(qName);
            cls = TagNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchedItemStruct");
            cachedSerQNames.add(qName);
            cls = WatchedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchItemStruct");
            cachedSerQNames.add(qName);
            cls = WatchItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchListInfoStruct");
            cachedSerQNames.add(qName);
            cls = WatchListInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public DoAddDescToItemsResponse doAddDescToItems(DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddDescToItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoAddDescToItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoAddDescToItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoAddDescToItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoAddToBlackListResponse doAddToBlackList(DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoAddToWatchListResponse doAddToWatchList(DoAddToWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoAddToWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoAddToWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoAddToWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoBidItemResponse doBidItem(DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCancelBidItemResponse doCancelBidItem(DoCancelBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCancelBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCancelBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCancelBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCancelRefundFormResponse doCancelRefundForm(DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCancelRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCancelRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCancelRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCancelRefundWarningResponse doCancelRefundWarning(DoCancelRefundWarningRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarning");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundWarning"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCancelRefundWarningResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCancelRefundWarningResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCancelRefundWarningResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCancelTransactionResponse doCancelTransaction(DoCancelTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCancelTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCancelTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCancelTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoChangeItemFieldsResponse doChangeItemFields(DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoChangePriceItemResponse doChangePriceItem(DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoChangeQuantityItemResponse doChangeQuantityItem(DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCheckItemDescriptionResponse doCheckItemDescription(DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCheckNewAuctionExtResponse doCheckNewAuctionExt(DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoCreateItemTemplateResponse doCreateItemTemplate(DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCreateItemTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoCreateItemTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoCreateItemTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoCreateItemTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoFeedbackResponse doFeedback(DoFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoFeedbackManyResponse doFeedbackMany(DoFeedbackManyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedbackMany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoFeedbackManyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoFeedbackManyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoFeedbackManyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoFinishItemResponse doFinishItem(DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoFinishItemsResponse doFinishItems(DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetAdminUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetAdminUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetAdminUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetAdminUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetArchiveRefundsListResponse doGetArchiveRefundsList(DoGetArchiveRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetArchiveRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetArchiveRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetArchiveRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetArchiveRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetArchiveRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetBidItem2Response doGetBidItem2(DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetBlackListUsersResponse doGetBlackListUsers(DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetCategoryPathResponse doGetCategoryPath(DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetCatsDataResponse doGetCatsData(DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetCatsDataCountResponse doGetCatsDataCount(DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetCatsDataLimitResponse doGetCatsDataLimit(DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetCountriesResponse doGetCountries(DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetDealsResponse doGetDeals(DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetFavouriteCategoriesResponse doGetFavouriteCategories(DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetFavouriteCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetFavouriteCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetFavouriteCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetFavouriteSellersResponse doGetFavouriteSellers(DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetFavouriteSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetFavouriteSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetFavouriteSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetFeedbackResponse doGetFeedback(DoGetFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetItemFieldsResponse doGetItemFields(DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetItemTemplatesResponse doGetItemTemplates(DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetItemsImagesResponse doGetItemsImages(DoGetItemsImagesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetItemsImagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetItemsImagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetItemsImagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetItemsInfoResponse doGetItemsInfo(DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetItemsListResponse doGetItemsList(DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMessageToBuyerResponse doGetMessageToBuyer(DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMessageToBuyer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMessageToBuyerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMessageToBuyerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMessageToBuyerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyAddressesResponse doGetMyAddresses(DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyBidItemsResponse doGetMyBidItems(DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyDataResponse doGetMyData(DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyFutureItemsResponse doGetMyFutureItems(DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyNotWonItemsResponse doGetMyNotWonItems(DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyPaymentsResponse doGetMyPayments(DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyPayoutsResponse doGetMyPayouts(DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMySellItemsResponse doGetMySellItems(DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMySellRatingResponse doGetMySellRating(DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellRating");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMySellRatingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMySellRatingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMySellRatingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMySoldItemsResponse doGetMySoldItems(DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyWatchItemsResponse doGetMyWatchItems(DoGetMyWatchItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyWatchItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyWatchItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyWatchItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyWatchedItemsResponse doGetMyWatchedItems(DoGetMyWatchedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWatchedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWatchedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyWatchedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyWatchedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyWatchedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetMyWonItemsResponse doGetMyWonItems(DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPaymentDataResponse doGetPaymentData(DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPaymentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPaymentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPaymentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPaymentMethodsResponse doGetPaymentMethods(DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPostBuyDataResponse doGetPostBuyData(DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetRefundsDealsResponse doGetRefundsDeals(DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetRefundsDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetRefundsDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetRefundsDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetRefundsListResponse doGetRefundsList(DoGetRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetRefundsReasonsResponse doGetRefundsReasons(DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetRefundsReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetRefundsReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetRefundsReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetRelatedItemsResponse doGetRelatedItems(DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormAttribsResponse doGetSellFormAttribs(DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormAttribs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormAttribsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormAttribsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormAttribsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormFieldsResponse doGetSellFormFields(DoGetSellFormFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormFieldsExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormFieldsExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormFieldsExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExtLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormFieldsExtLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormFieldsExtLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormFieldsExtLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellFormFieldsLimitResponse doGetSellFormFieldsLimit(DoGetSellFormFieldsLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellFormFieldsLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellFormFieldsLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellFormFieldsLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSellRatingReasonsResponse doGetSellRatingReasons(DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellRatingReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSellRatingReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSellRatingReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSellRatingReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSessionHandleForWidget");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSessionHandleForWidgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSessionHandleForWidgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSessionHandleForWidgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetShipmentDataResponse doGetShipmentData(DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentDataForRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetShipmentDataForRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetShipmentDataForRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetShipmentDataForRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetShopsTagsResponse doGetShopsTags(DoGetShopsTagsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShopsTags");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShopsTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetShopsTagsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetShopsTagsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetShopsTagsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSiteJournalResponse doGetSiteJournal(DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSiteJournalDealsResponse doGetSiteJournalDeals(DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSiteJournalInfoResponse doGetSiteJournalInfo(DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetStatesInfoResponse doGetStatesInfo(DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetSystemTimeResponse doGetSystemTime(DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetTransactionsIDsResponse doGetTransactionsIDs(DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetUserIDResponse doGetUserID(DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetUserLicenceDateResponse doGetUserLicenceDate(DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetUserLoginResponse doGetUserLogin(DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetWaitingFeedbacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetWaitingFeedbacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetWaitingFeedbacksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacksCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoGetWaitingFeedbacksCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoGetWaitingFeedbacksCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoGetWaitingFeedbacksCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoLoginResponse doLogin(DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoLoginEncResponse doLoginEnc(DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoLoginWithAccessTokenResponse doLoginWithAccessToken(DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginWithAccessToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoLoginWithAccessTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoLoginWithAccessTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoLoginWithAccessTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyAccount2Response doMyAccount2(DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyAccountItemsCountResponse doMyAccountItemsCount(DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyBillingResponse doMyBilling(DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyBillingItemResponse doMyBillingItem(DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyContactResponse doMyContact(DoMyContactRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyContactResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyContactResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyContactResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyFeedback2Response doMyFeedback2(DoMyFeedback2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyFeedback2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyFeedback2Response) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyFeedback2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoMyFeedback2LimitResponse doMyFeedback2Limit(DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2Limit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoMyFeedback2LimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoMyFeedback2LimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoMyFeedback2LimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoNewAuctionExtResponse doNewAuctionExt(DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoQueryAllSysStatusResponse doQueryAllSysStatus(DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoQuerySysStatusResponse doQuerySysStatus(DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRemoveFromBlackListResponse doRemoveFromBlackList(DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRemoveFromWatchListResponse doRemoveFromWatchList(DoRemoveFromWatchListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRemoveFromWatchListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRemoveFromWatchListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRemoveFromWatchListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRemoveItemTemplatesResponse doRemoveItemTemplates(DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRemoveItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRemoveItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRemoveItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRequestCancelBidResponse doRequestCancelBid(DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestCancelBid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRequestCancelBidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRequestCancelBidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRequestCancelBidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRequestPayoutResponse doRequestPayout(DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoRequestSurchargeResponse doRequestSurcharge(DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestSurcharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoRequestSurchargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoRequestSurchargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoRequestSurchargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSellSomeAgainResponse doSellSomeAgain(DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSellSomeAgainInShopResponse doSellSomeAgainInShop(DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSendEmailToUserResponse doSendEmailToUser(DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSendPostBuyFormResponse doSendPostBuyForm(DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSendPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSendPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSendPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSendRefundFormResponse doSendRefundForm(DoSendRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSendRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSendRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSendRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSetShipmentPriceTypeResponse doSetShipmentPriceType(DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoSetUserLicenceDateResponse doSetUserLicenceDate(DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoSetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoSetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoSetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoShowItemInfoExtResponse doShowItemInfoExt(DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoShowUserResponse doShowUser(DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DoVerifyItemResponse doVerifyItem(DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
