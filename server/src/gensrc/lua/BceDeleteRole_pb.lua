-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceDeleteRole_pb', package.seeall)


local BCEDELETEROLE = protobuf.Descriptor();
local BCEDELETEROLE_USERID_FIELD = protobuf.FieldDescriptor();
local BCEDELETEROLE_SERVERID_FIELD = protobuf.FieldDescriptor();

BCEDELETEROLE_USERID_FIELD.name = "userid"
BCEDELETEROLE_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceDeleteRole.userid"
BCEDELETEROLE_USERID_FIELD.number = 1
BCEDELETEROLE_USERID_FIELD.index = 0
BCEDELETEROLE_USERID_FIELD.label = 1
BCEDELETEROLE_USERID_FIELD.has_default_value = false
BCEDELETEROLE_USERID_FIELD.default_value = ""
BCEDELETEROLE_USERID_FIELD.type = 9
BCEDELETEROLE_USERID_FIELD.cpp_type = 9

BCEDELETEROLE_SERVERID_FIELD.name = "serverid"
BCEDELETEROLE_SERVERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceDeleteRole.serverid"
BCEDELETEROLE_SERVERID_FIELD.number = 2
BCEDELETEROLE_SERVERID_FIELD.index = 1
BCEDELETEROLE_SERVERID_FIELD.label = 1
BCEDELETEROLE_SERVERID_FIELD.has_default_value = false
BCEDELETEROLE_SERVERID_FIELD.default_value = ""
BCEDELETEROLE_SERVERID_FIELD.type = 9
BCEDELETEROLE_SERVERID_FIELD.cpp_type = 9

BCEDELETEROLE.name = "BceDeleteRole"
BCEDELETEROLE.full_name = ".com.xinqihd.sns.gameserver.proto.BceDeleteRole"
BCEDELETEROLE.nested_types = {}
BCEDELETEROLE.enum_types = {}
BCEDELETEROLE.fields = {BCEDELETEROLE_USERID_FIELD, BCEDELETEROLE_SERVERID_FIELD}
BCEDELETEROLE.is_extendable = false
BCEDELETEROLE.extensions = {}

BceDeleteRole = protobuf.Message(BCEDELETEROLE)
_G.BCEDELETEROLE_PB_BCEDELETEROLE = BCEDELETEROLE
