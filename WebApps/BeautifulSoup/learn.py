from bs4 import BeautifulSoup
import urllib.request

with urllib.request.urlopen("https://www.sportsinsights.com/nba/") as url:
    s = url.read()


soup = BeautifulSoup(s, 'lxml')

tag = soup.find('td', {'class' : 'pct'}) # id="toc" also works
# get all the links
links = tag.findAll('span') # <a href='/path/to/div'>topic</a>
# print them
for link in links:
  print(link.text) # get text from <a>
