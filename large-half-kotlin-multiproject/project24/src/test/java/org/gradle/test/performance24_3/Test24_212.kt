package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_212 {
    private val production = Production24_212("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}