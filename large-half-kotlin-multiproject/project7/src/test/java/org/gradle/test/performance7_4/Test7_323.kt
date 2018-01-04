package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_323 {
    private val production = Production7_323("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}