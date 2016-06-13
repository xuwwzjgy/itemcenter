/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/6/3 13:56:05                            */
/*==============================================================*/


drop table if exists brand;

drop table if exists category;

drop table if exists country;

drop table if exists item;

drop table if exists item_detail;

drop table if exists item_log;

drop table if exists item_param_option;

drop table if exists item_parameter;

drop table if exists picmap;

drop table if exists sale_param_option;

drop table if exists sale_parameter;

drop table if exists sku;

drop table if exists sku_detail;

/*==============================================================*/
/* Table: brand                                                 */
/*==============================================================*/
create table brand
(
   brandId              bigint(20)  comment '品牌ID',
   brandNameEn          varchar(64) comment '品牌英文名',
   brandNameZh          varchar(64) comment '品牌中文名',
   countryCode          varchar(32) comment '国家编码',
   gmtCreate            datetime comment '创建时间',
   gmtModified          datetime comment '修改时间',
   isDelete             tinyint(4) comment '是否删除',
   type                 tinyint(4) comment '1.餐饮 2.酒店 3.商品',
   feature              varchar(255) comment '格式如：k1=v1;k2=v2…',
  primary key (brandId)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table brand comment '品牌brand';

/*==============================================================*/
/* Table: category                                   */
/*==============================================================*/
create table category
(
   id                   bigint(20) not null comment 'Id',
   level                int(10) not null comment '类目等级',
   name                 varchar(32) not null comment '类目名称',
   productParameter     varchar(255) comment '格式如[1,2,3,4]',
   saleParameter        varchar(255) comment '如[1,2,3,4]',
   showIndex            int(10) not null comment '显示顺序',
   superCategoryId      bigint(20) comment '父类目的Id',
   isDelete             tinyint(3) not null comment '是否删除',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment '格式如：k1=v1;k2=v2…',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table category comment '商品类目表category';

/*==============================================================*/
/* Table: country                                    */
/*==============================================================*/
create table country
(
   id                   bigint(20)  comment 'id',
   countryCode          varchar(64) comment '国家编码',
   countryNameEn        varchar(255) comment '国家英文名',
   countryName          varchar(255) comment '国名',
   flagUrl              varchar(255) comment '国旗',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment '格式如：k1=v1;k2=v2…'
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table country comment '国家country';

/*==============================================================*/
/* Table: item                                       */
/*==============================================================*/
create table item
(
   id                   bigint(20) not null comment '商品id',
   goodsNo              varchar(255) comment '商品货号',
   marketPrice          decimal(10,2) not null comment '正品价',
   salePrice            decimal(10,2) not null comment '销售价',
   infoFlag             tinyint(4) not null comment '位从右到左分别表示商品基本信息是否录入、图片是否录入、详情信息是否录入',
   showPicPath          varchar(255) comment '缩略图地址',
   lowCategoryId        bigint(20) not null comment '最低层类目id',
   brandId              bigint(20) comment '所属品牌',
   productName          varchar(60) comment '商品名称',
   shopId               bigint(20) not null comment '店铺id',
   carriageTempId       bigint(20) not null comment '运费模板id',
   saleMode             tinyint(3) comment '1, 平台自采
            2, 平台代销
            3, 商家自运营',
   status               tinyint(3) comment '1在售中
             0已下架',
   businessId           bigint(20) not null comment '商家',
   isDelete             tinyint(3) not null comment '是否被删除',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   flag                 tinyint(3) comment '标识',
   feature              varchar(255) comment '格式如：k1=v1;k2=v2…',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table item comment '商品item';

/*==============================================================*/
/* Table: item_detail                                */
/*==============================================================*/
create table item_detail
(
   id                   bigint(20) not null comment 'Id',
   itemId               bigint(20) not null comment '商品id',
   parameter            varchar(255) comment '属性名+值(id:value)      
            如 1:1001,2:1002,3:1003',
   customEditHTML       varchar(255) not null comment '用户富文本框编辑的HTML',
   unit                 tinyint(4) not null comment '0,null
            1, 件
            2, 个
            3, 双
            4, 支
            5, 副
            6, 套
            7, 台
            8, 本
            9, 片
            10, 盒
            12, 斤',
   itemDesc             varchar(255) comment '商品描述',
   producing            varchar(255) comment '产地',
   weight               varchar(255) comment '重量',
   isJointPic           tinyint(3) not null comment '是否拼接大图',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment '格式如：k1=v1;k2=v2….',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table item_detail comment '商品细节item_detail';

/*==============================================================*/
/* Table: item_log                                   */
/*==============================================================*/
create table item_log
(
   id                   bigint(20) not null comment 'id',
   entityId             bigint(20) comment '实体ID',
   type                 tinyint(3) comment '3.商品修改
            4.商品删除
            5.商品上架
            6.商品下架
            13.sku删除
            14.sku修改',
   oprAccount           varchar(100) comment '操作人',
   content              varchar(512) comment '操作内容',
   oprTime              datetime comment '操作时间',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table item_log comment '操作日志表';

/*==============================================================*/
/* Table: item_param_option                          */
/*==============================================================*/
create table item_param_option
(
   id                   bigint(20) not null comment '主键',
   prodParamId          bigint(20) not null comment '商品参数id',
   value                varchar(255) not null comment '该选项显示的内容',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table item_param_option comment '商品参数选项item_param_option';

/*==============================================================*/
/* Table: item_parameter                             */
/*==============================================================*/
create table item_parameter
(
   id                   bigint(20) not null comment '主键',
   detailType           tinyint(3) not null comment '1:SINGLE_SELECT 
            2:TEXT
            3:TEXT_AREA
            4:MULTI_SELECT',
   isRequired           tinyint(1) not null comment '是否必填',
   name                 varchar(255) not null comment '商品参数名称',
   text                 varchar(255) not null comment '填写内容提示文字',
   isDelete             tinyint(4) not null comment '是否删除',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table item_parameter comment '商品参数item_parameter';

/*==============================================================*/
/* Table: picmap                                     */
/*==============================================================*/
create table picmap
(
   id                   bigint(20) not null comment '主键',
   productId            bigint(20) not null comment '商品id',
   picType              tinyint(3) not null comment '-1:NULL
            1, 商品展示
            2, 详情展示',
   picPath              varchar(700) not null comment '图片路径',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table picmap comment '商品和图片的映射关系pic_map';

/*==============================================================*/
/* Table: sale_param_option                          */
/*==============================================================*/
create table sale_param_option
(
   id                   bigint(20) not null comment '主键',
   prodParamId          bigint(20) not null comment '商品参数id',
   balue                varchar(255) not null comment '该选项显示的内容',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table sale_param_option comment '商品销售属性选项sale_param_option';

/*==============================================================*/
/* Table: sale_parameter                             */
/*==============================================================*/
create table sale_parameter
(
   id                   bigint(20) not null comment '主键',
   name                 varchar(255) not null comment '商品参数名称',
   text                 varchar(255) not null comment '填写内容提示文字',
   isDelete             tinyint(4) not null comment '是否删除',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table sale_parameter comment '商品销售属性sale_parameter';

/*==============================================================*/
/* Table: sku                                        */
/*==============================================================*/
create table sku
(
   id                   bigint(20) not null comment '主键',
   productId            bigint(20) not null comment '产品id',
   barCode              varchar(255) not null comment '条形码',
   marketPrice          decimal(10,2) comment '正品价',
   salePrice            decimal(10,2) not null comment '销售价',
   thumb                varchar(255) comment '缩略图地址',
   IsDelete             int(10) not null comment '是否被删除',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   skuUrl               varchar(255) comment 'url二维码链',
   flag                 tinyint(3) comment '标识',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table sku comment 'SKU最小库存单位sku';

/*==============================================================*/
/* Table: sku_detail                                 */
/*==============================================================*/
create table sku_detail
(
   id                   bigint(20) not null comment 'id',
   skuId                bigint(20) not null comment 'skuId',
   parameter            varchar(255) comment '属性名+值(id:value)           
            如：1:1001,2:1002,3:1003',
   customEditHTML       varchar(255) not null comment '用户富文本框编辑的HTML',
   unit                 tinyint(4) not null comment '0,null
            1, 件
            2, 个
            3, 双
            4, 支
            5, 副
            6, 套
            7, 台
            8, 本
            9, 片
            10, 盒
            12, 斤',
   itemDesc             varchar(255) comment '商品描述',
   producing            varchar(255) comment '产地',
   weight               varchar(255) comment '重量',
   isJointPic           tinyint(3) not null comment '是否拼接大图',
   gmtModified          datetime comment '修改时间',
   gmtCreate            datetime comment '创建时间',
   feature              varchar(255) comment 'feature备用',
   primary key (id)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=COMPACT;

alter table sku_detail comment 'Sku细节sku_detail';

