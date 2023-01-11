commands += Command.command("cls") { state =>
  print("\033c")
  state
}
