close all
clear all

x1 =[3 4 2 5 6 ];
fftshift(x1)

x = fft(x1);
% w = angle(fft(x1));
y=fftshift(x);

abs(y)
angle(y)

% t=0:N-1;
% subplot(311)
% stem(t,x);
% xlabel('Time (s)');
% ylabel('Amplitude');
% title('Input sequence')
% 
% subplot(312); 
% stem(0:N-1,abs(fft(x)));  
% xlabel('Frequency');
% ylabel('|X(k)|');
% title('Magnitude Response'); 

% subplot(213); 
% stem(0:N-1,angle(fft(x1)));
% xlabel('Frequency');
% ylabel('Phase');
% title('Phase Response'); 
