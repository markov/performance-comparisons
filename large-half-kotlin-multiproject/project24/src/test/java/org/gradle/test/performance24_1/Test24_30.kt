package org.gradle.test.performance24_1

import org.junit.Assert.*

class Test24_30 {
    private val production = Production24_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}