DSCH 2.6i
VERSION 4/18/2003 9:27:46 AM
BB(-50,-144,159,-80)
SYM  #Z
BB(-50,-120,0,-80)
TITLE -50 -86  #kbd
MODEL 85
PROP                                                                                                                                                                                                           
REC(-50,-120,40,40,r)
VIS 3
PIN(0,-85,0.000,0.000)Z0
PIN(0,-95,0.000,0.000)Z1
PIN(0,-105,0.000,0.000)Z2
PIN(0,-115,0.000,0.000)Z3
LIG(-10,-120,-10,-80)
LIG(-50,-120,-10,-120)
LIG(-50,-120,-50,-80)
LIG(-16,-115,-16,-112)
LIG(-50,-100,-10,-100)
LIG(-30,-120,-30,-80)
LIG(-40,-80,-40,-120)
LIG(-50,-110,-10,-110)
LIG(-20,-120,-20,-80)
LIG(-50,-90,-10,-90)
LIG(-10,-85,0,-85)
LIG(0,-95,-10,-95)
LIG(-10,-105,0,-105)
LIG(0,-115,-10,-115)
LIG(-46,-82,-46,-88)
LIG(-46,-88,-44,-88)
LIG(-44,-88,-44,-82)
LIG(-44,-82,-46,-82)
LIG(-34,-82,-34,-88)
LIG(-26,-88,-24,-88)
LIG(-24,-88,-24,-86)
LIG(-24,-86,-26,-86)
LIG(-26,-86,-26,-82)
LIG(-26,-82,-24,-82)
LIG(-16,-82,-14,-82)
LIG(-14,-88,-16,-88)
LIG(-14,-88,-14,-82)
LIG(-16,-86,-14,-86)
LIG(-46,-98,-46,-94)
LIG(-46,-94,-44,-94)
LIG(-44,-98,-44,-92)
LIG(-34,-98,-36,-98)
LIG(-36,-98,-36,-96)
LIG(-36,-96,-34,-96)
LIG(-34,-96,-34,-92)
LIG(-34,-92,-36,-92)
LIG(-26,-98,-26,-92)
LIG(-26,-92,-24,-92)
LIG(-24,-92,-24,-96)
LIG(-24,-96,-26,-96)
LIG(-16,-98,-14,-98)
LIG(-14,-98,-14,-92)
LIG(-46,-108,-46,-102)
LIG(-46,-108,-44,-108)
LIG(-44,-108,-44,-102)
LIG(-44,-102,-46,-102)
LIG(-46,-106,-44,-106)
LIG(-16,-115,-14,-115)
LIG(-50,-80,-10,-80)
LIG(-36,-108,-34,-108)
LIG(-16,-118,-16,-115)
LIG(-27,-112,-27,-115)
LIG(-27,-118,-24,-118)
LIG(-36,-118,-36,-112)
LIG(-47,-112,-47,-118)
LIG(-47,-118,-44,-118)
LIG(-17,-108,-14,-108)
LIG(-14,-108,-13,-107)
LIG(-13,-107,-14,-106)
LIG(-17,-106,-14,-106)
LIG(-17,-102,-17,-106)
LIG(-36,-106,-34,-106)
LIG(-47,-112,-44,-112)
LIG(-36,-108,-36,-106)
LIG(-34,-106,-34,-102)
LIG(-34,-108,-34,-106)
LIG(-34,-102,-36,-102)
LIG(-27,-112,-24,-112)
LIG(-27,-102,-25,-108)
LIG(-25,-108,-23,-102)
LIG(-17,-106,-17,-108)
LIG(-14,-106,-13,-105)
LIG(-16,-118,-13,-118)
LIG(-13,-105,-13,-103)
LIG(-27,-104,-23,-104)
LIG(-33,-113,-34,-112)
LIG(-13,-103,-14,-102)
LIG(-27,-115,-27,-118)
LIG(-27,-115,-25,-115)
LIG(-33,-117,-33,-113)
LIG(-34,-118,-33,-117)
LIG(-37,-112,-36,-112)
LIG(-37,-118,-36,-118)
LIG(-17,-102,-14,-102)
LIG(-36,-118,-34,-118)
LIG(-36,-112,-34,-112)
FSYM
SYM  #button1
BB(-19,-144,-10,-136)
TITLE -15 -140  #button
MODEL 59
PROP                                                                                                                                                                                                           
REC(-18,-143,6,6,r)
VIS 1
PIN(-10,-140,0.000,0.000)Z4
LIG(-11,-140,-10,-140)
LIG(-19,-136,-19,-144)
LIG(-11,-136,-19,-136)
LIG(-11,-144,-11,-136)
LIG(-19,-144,-11,-144)
LIG(-18,-137,-18,-143)
LIG(-12,-137,-18,-137)
LIG(-12,-143,-12,-137)
LIG(-18,-143,-12,-143)
FSYM
SYM  #or3
BB(95,-125,135,-95)
TITLE 110 -105  #|
MODEL 503
PROP                                                                                                                                                                                                           
REC(0,0,0,0,)
VIS 0
PIN(95,-120,0.000,0.000)a
PIN(95,-110,0.000,0.000)b
PIN(95,-100,0.000,0.000)c
PIN(135,-110,0.120,0.070)s
LIG(95,-100,109,-100)
LIG(95,-110,111,-110)
LIG(95,-120,109,-120)
LIG(109,-100,105,-95)
LIG(120,-99,115,-96)
LIG(124,-107,120,-99)
LIG(115,-124,120,-121)
LIG(105,-125,115,-124)
LIG(125,-110,124,-107)
LIG(124,-113,125,-110)
LIG(105,-95,115,-96)
LIG(120,-121,124,-113)
LIG(105,-125,109,-120)
LIG(109,-120,111,-110)
LIG(111,-110,109,-100)
LIG(125,-110,135,-110)
VLG  or or3(s,a,b,c);
FSYM
SYM  #light1
BB(153,-125,159,-111)
TITLE 155 -111  #light
MODEL 49
PROP                                                                                                                                                                                                           
REC(154,-124,4,4,r)
VIS 1
PIN(155,-110,0.000,0.000)SupOrEqual10
LIG(158,-119,158,-124)
LIG(158,-124,157,-125)
LIG(154,-124,154,-119)
LIG(157,-114,157,-117)
LIG(156,-114,159,-114)
LIG(156,-112,158,-114)
LIG(157,-112,159,-114)
LIG(153,-117,159,-117)
LIG(155,-117,155,-110)
LIG(153,-119,153,-117)
LIG(159,-119,153,-119)
LIG(159,-117,159,-119)
LIG(155,-125,154,-124)
LIG(157,-125,155,-125)
FSYM
SYM  #and2
BB(25,-120,60,-100)
TITLE 37 -109  #&
MODEL 402
PROP                                                                                                                                                                                                           
REC(0,0,0,0,)
VIS 0
PIN(25,-105,0.000,0.000)b
PIN(25,-115,0.000,0.000)a
PIN(60,-110,0.090,0.070)s
LIG(25,-105,33,-105)
LIG(33,-120,33,-100)
LIG(53,-110,60,-110)
LIG(52,-108,49,-104)
LIG(53,-110,52,-108)
LIG(52,-112,53,-110)
LIG(49,-116,52,-112)
LIG(44,-119,49,-116)
LIG(49,-104,44,-101)
LIG(44,-101,33,-100)
LIG(33,-120,44,-119)
LIG(25,-115,33,-115)
VLG  and and2(out,a,b);
FSYM
SYM  #and2
BB(55,-100,90,-80)
TITLE 67 -89  #&
MODEL 402
PROP                                                                                                                                                                                                           
REC(0,0,0,0,)
VIS 0
PIN(55,-85,0.000,0.000)b
PIN(55,-95,0.000,0.000)a
PIN(90,-90,0.090,0.070)s
LIG(55,-85,63,-85)
LIG(63,-100,63,-80)
LIG(83,-90,90,-90)
LIG(82,-88,79,-84)
LIG(83,-90,82,-88)
LIG(82,-92,83,-90)
LIG(79,-96,82,-92)
LIG(74,-99,79,-96)
LIG(79,-84,74,-81)
LIG(74,-81,63,-80)
LIG(63,-100,74,-99)
LIG(55,-95,63,-95)
VLG  and and2(out,a,b);
FSYM
CNC(20 -115)
LIG(0,-115,20,-115)
LIG(0,-105,25,-105)
LIG(20,-115,20,-95)
LIG(20,-115,25,-115)
LIG(20,-95,55,-95)
LIG(0,-95,10,-95)
LIG(10,-95,10,-85)
LIG(10,-85,55,-85)
LIG(-10,-140,60,-140)
LIG(90,-90,90,-100)
LIG(90,-100,95,-100)
LIG(60,-110,95,-110)
LIG(60,-140,60,-120)
LIG(60,-120,95,-120)
LIG(135,-110,155,-110)
FFIG C:\Documents and Settings\Administrator\My Documents\Dsch2\Book on CMOS\SupEqu10.sch