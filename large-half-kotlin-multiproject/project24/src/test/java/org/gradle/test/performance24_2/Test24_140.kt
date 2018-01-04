package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_140 {
    private val production = Production24_140("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}