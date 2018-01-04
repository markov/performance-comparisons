package org.gradle.test.performance36_4

import org.junit.Assert.*

class Test36_372 {
    private val production = Production36_372("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}