-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceSplitProp_pb', package.seeall)


local BCESPLITPROP = protobuf.Descriptor();
local BCESPLITPROP_SRCPEW_FIELD = protobuf.FieldDescriptor();
local BCESPLITPROP_DSTPEW_FIELD = protobuf.FieldDescriptor();
local BCESPLITPROP_DSTCOUNT_FIELD = protobuf.FieldDescriptor();

BCESPLITPROP_SRCPEW_FIELD.name = "srcPew"
BCESPLITPROP_SRCPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSplitProp.srcPew"
BCESPLITPROP_SRCPEW_FIELD.number = 1
BCESPLITPROP_SRCPEW_FIELD.index = 0
BCESPLITPROP_SRCPEW_FIELD.label = 2
BCESPLITPROP_SRCPEW_FIELD.has_default_value = false
BCESPLITPROP_SRCPEW_FIELD.default_value = 0
BCESPLITPROP_SRCPEW_FIELD.type = 5
BCESPLITPROP_SRCPEW_FIELD.cpp_type = 1

BCESPLITPROP_DSTPEW_FIELD.name = "dstPew"
BCESPLITPROP_DSTPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSplitProp.dstPew"
BCESPLITPROP_DSTPEW_FIELD.number = 2
BCESPLITPROP_DSTPEW_FIELD.index = 1
BCESPLITPROP_DSTPEW_FIELD.label = 2
BCESPLITPROP_DSTPEW_FIELD.has_default_value = false
BCESPLITPROP_DSTPEW_FIELD.default_value = 0
BCESPLITPROP_DSTPEW_FIELD.type = 5
BCESPLITPROP_DSTPEW_FIELD.cpp_type = 1

BCESPLITPROP_DSTCOUNT_FIELD.name = "dstCount"
BCESPLITPROP_DSTCOUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSplitProp.dstCount"
BCESPLITPROP_DSTCOUNT_FIELD.number = 3
BCESPLITPROP_DSTCOUNT_FIELD.index = 2
BCESPLITPROP_DSTCOUNT_FIELD.label = 2
BCESPLITPROP_DSTCOUNT_FIELD.has_default_value = false
BCESPLITPROP_DSTCOUNT_FIELD.default_value = 0
BCESPLITPROP_DSTCOUNT_FIELD.type = 5
BCESPLITPROP_DSTCOUNT_FIELD.cpp_type = 1

BCESPLITPROP.name = "BceSplitProp"
BCESPLITPROP.full_name = ".com.xinqihd.sns.gameserver.proto.BceSplitProp"
BCESPLITPROP.nested_types = {}
BCESPLITPROP.enum_types = {}
BCESPLITPROP.fields = {BCESPLITPROP_SRCPEW_FIELD, BCESPLITPROP_DSTPEW_FIELD, BCESPLITPROP_DSTCOUNT_FIELD}
BCESPLITPROP.is_extendable = false
BCESPLITPROP.extensions = {}

BceSplitProp = protobuf.Message(BCESPLITPROP)
_G.BCESPLITPROP_PB_BCESPLITPROP = BCESPLITPROP
