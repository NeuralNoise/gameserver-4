-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildLevelUp_pb', package.seeall)


local BSEGUILDLEVELUP = protobuf.Descriptor();
local BSEGUILDLEVELUP_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEGUILDLEVELUP_GUILDINFO_FIELD = protobuf.FieldDescriptor();

BSEGUILDLEVELUP_RESULT_FIELD.name = "result"
BSEGUILDLEVELUP_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLevelUp.result"
BSEGUILDLEVELUP_RESULT_FIELD.number = 1
BSEGUILDLEVELUP_RESULT_FIELD.index = 0
BSEGUILDLEVELUP_RESULT_FIELD.label = 2
BSEGUILDLEVELUP_RESULT_FIELD.has_default_value = false
BSEGUILDLEVELUP_RESULT_FIELD.default_value = 0
BSEGUILDLEVELUP_RESULT_FIELD.type = 5
BSEGUILDLEVELUP_RESULT_FIELD.cpp_type = 1

BSEGUILDLEVELUP_GUILDINFO_FIELD.name = "guildInfo"
BSEGUILDLEVELUP_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLevelUp.guildInfo"
BSEGUILDLEVELUP_GUILDINFO_FIELD.number = 2
BSEGUILDLEVELUP_GUILDINFO_FIELD.index = 1
BSEGUILDLEVELUP_GUILDINFO_FIELD.label = 1
BSEGUILDLEVELUP_GUILDINFO_FIELD.has_default_value = false
BSEGUILDLEVELUP_GUILDINFO_FIELD.default_value = nil
BSEGUILDLEVELUP_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEGUILDLEVELUP_GUILDINFO_FIELD.type = 11
BSEGUILDLEVELUP_GUILDINFO_FIELD.cpp_type = 10

BSEGUILDLEVELUP.name = "BseGuildLevelUp"
BSEGUILDLEVELUP.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLevelUp"
BSEGUILDLEVELUP.nested_types = {}
BSEGUILDLEVELUP.enum_types = {}
BSEGUILDLEVELUP.fields = {BSEGUILDLEVELUP_RESULT_FIELD, BSEGUILDLEVELUP_GUILDINFO_FIELD}
BSEGUILDLEVELUP.is_extendable = false
BSEGUILDLEVELUP.extensions = {}

BseGuildLevelUp = protobuf.Message(BSEGUILDLEVELUP)
_G.BSEGUILDLEVELUP_PB_BSEGUILDLEVELUP = BSEGUILDLEVELUP

