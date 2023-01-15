close all
clear all
clc

n= -10:10;
f=(n==10);
stem(n,f)

xlabel('n');
ylabel('delta(n)');
title('Unit Sample Signal ');
axis([-12 12 0 1.1])