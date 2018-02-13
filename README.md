# archon

## TODO

- travis to run some basic junit
- setup a container with elasticsearch and a few basic docs


## notes

the semantic monitronig idea

use kotlin?

spike in memory, then use some database (riak? which properties do we need? memcached actually would be a good fit as we only need to cache data for some time, persistence is not a thing)

grammar?

sketches:
```
correlate req-id-reader-name
foreach logline matching {
  ... field matchers as json-like? similar to mongo query synta? or actually can use elasticsearch query syntax itself for great pluggability
  syslog_prog: "service A",
  message: /doing (A|B)/,
  ...
}
expect exactly three
loglines matching {
  ... as above
  mesage: /received event C/
}
drop trail at logline matching {
  ... match last message of a correlation to clear database cache
}
timeout after 10 minutes

// or expressions? expect a or b?
// prototype? exepct one for each of {"message": "${m}"} with m in a,b,c ...
```

"recheck with more interval" button for timeouted?

would show dashboard like icinga

keep in storage pointers to loglines for failed checks (forever? until manual intervention drops them?)

"policies" model like petri

need to stream events tho


