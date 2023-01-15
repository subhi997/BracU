close all
clear all
clc

n=-10:10;

f=(n-2 >= 0);
stem(n,f)

xlabel('n');
ylabel('u(n)');
title('Unit Step Signal ');
axis([-12 12 0 1.1])
