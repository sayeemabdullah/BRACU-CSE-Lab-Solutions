﻿clc;
close all;
A=1;
B=7;
C=1;
D=0;
E=1;
F=0;
G=0;
H=9;
M=4;
g = 9.8;
v0 = 10*(B + (G/10));
v0 = 10*(B + (g/10));
theta = (5*B + H)/10;
t = 0:0.1:10;
x0 = 0; y0 = 0;
y = y0 - (0.5*G*t.^2)+ (v0*sin(theta))*t;
x = x0 + (v0*cos(theta))*t;
plot(t,x);
plot(t, y)