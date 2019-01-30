import whois

verbose = true

def show_whois:
  if verbose:
    w = whois.whois("foo.org")
    print(w)