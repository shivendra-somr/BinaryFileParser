meta:
  id: identify
  endian: le

seq:
  - id: words
    type: u2
    repeat: expr
    repeat-expr: 256

instances:
  model_number:
    pos: 27 * 2
    size: (47 - 27 + 1) * 2
    type: strz
    encoding: ISO-8859-1