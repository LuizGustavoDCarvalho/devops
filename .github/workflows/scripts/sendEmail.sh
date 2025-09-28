cd ci
sudo apt-get install mailutils
echo "sending email after pipeline completion" | mail -s "Pipeline" luiz.carvalho@gec.inatel.br