close all;
clear all;
clc;
data=importdata('A01E.mat');
start=1;%252



run1=[];
for i=4:9 %run
    run=data{1,i};
    trial1=[];
    for j= 1:48 %trial
        end1=run.trial(j,1);%251
        channels=[];
        for k=1:22 %channel;
            val=run.X(start:end1,k);
            v=std(val);
            channels=[channels v];
            %feature extraction 
        end
        start=run.trial(j,1)+1;%251
        trial1=[trial1 channels];
    end
   run1=[run1 trial1];
end
run1