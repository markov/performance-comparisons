package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_241 {
    private val production = Production24_241("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}