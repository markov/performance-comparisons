package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_243 {
    private val production = Production24_243("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}