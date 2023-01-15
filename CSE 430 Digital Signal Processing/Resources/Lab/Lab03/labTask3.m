close all;
clear all;
clc;

n = importdata('Z001.txt');
 [a,b]=size(n);
%xf=fft(n);
Energy=sum(n.^2)/a
