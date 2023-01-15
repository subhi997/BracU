close all
clear all
clc

s=2;
w=3;
n=0:50;
x= abs(exp(s+(j*w))* n);

stem(n,x)