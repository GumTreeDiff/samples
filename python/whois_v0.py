import whois

def show_whois():
  w = whois.whois("foo.org")
  print(w)