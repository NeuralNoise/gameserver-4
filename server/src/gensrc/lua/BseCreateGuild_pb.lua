-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseCreateGuild_pb', package.seeall)


local BSECREATEGUILD = protobuf.Descriptor();
local BSECREATEGUILD_RESULT_FIELD = protobuf.FieldDescriptor();
local BSECREATEGUILD_MESSAGE_FIELD = protobuf.FieldDescriptor();
local BSECREATEGUILD_GUILD_FIELD = protobuf.FieldDescriptor();

BSECREATEGUILD_RESULT_FIELD.name = "result"
BSECREATEGUILD_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCreateGuild.result"
BSECREATEGUILD_RESULT_FIELD.number = 1
BSECREATEGUILD_RESULT_FIELD.index = 0
BSECREATEGUILD_RESULT_FIELD.label = 1
BSECREATEGUILD_RESULT_FIELD.has_default_value = false
BSECREATEGUILD_RESULT_FIELD.default_value = 0
BSECREATEGUILD_RESULT_FIELD.type = 5
BSECREATEGUILD_RESULT_FIELD.cpp_type = 1

BSECREATEGUILD_MESSAGE_FIELD.name = "message"
BSECREATEGUILD_MESSAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCreateGuild.message"
BSECREATEGUILD_MESSAGE_FIELD.number = 2
BSECREATEGUILD_MESSAGE_FIELD.index = 1
BSECREATEGUILD_MESSAGE_FIELD.label = 1
BSECREATEGUILD_MESSAGE_FIELD.has_default_value = false
BSECREATEGUILD_MESSAGE_FIELD.default_value = ""
BSECREATEGUILD_MESSAGE_FIELD.type = 9
BSECREATEGUILD_MESSAGE_FIELD.cpp_type = 9

BSECREATEGUILD_GUILD_FIELD.name = "guild"
BSECREATEGUILD_GUILD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCreateGuild.guild"
BSECREATEGUILD_GUILD_FIELD.number = 3
BSECREATEGUILD_GUILD_FIELD.index = 2
BSECREATEGUILD_GUILD_FIELD.label = 1
BSECREATEGUILD_GUILD_FIELD.has_default_value = false
BSECREATEGUILD_GUILD_FIELD.default_value = nil
BSECREATEGUILD_GUILD_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSECREATEGUILD_GUILD_FIELD.type = 11
BSECREATEGUILD_GUILD_FIELD.cpp_type = 10

BSECREATEGUILD.name = "BseCreateGuild"
BSECREATEGUILD.full_name = ".com.xinqihd.sns.gameserver.proto.BseCreateGuild"
BSECREATEGUILD.nested_types = {}
BSECREATEGUILD.enum_types = {}
BSECREATEGUILD.fields = {BSECREATEGUILD_RESULT_FIELD, BSECREATEGUILD_MESSAGE_FIELD, BSECREATEGUILD_GUILD_FIELD}
BSECREATEGUILD.is_extendable = false
BSECREATEGUILD.extensions = {}

BseCreateGuild = protobuf.Message(BSECREATEGUILD)
_G.BSECREATEGUILD_PB_BSECREATEGUILD = BSECREATEGUILD

