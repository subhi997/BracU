close all
clear all
clc

n=0:100;
x = (0.8).^n;

stem(n,x)

xlabel('n');
ylabel('exp(x)');
title('Real Valued Exponential sequence');