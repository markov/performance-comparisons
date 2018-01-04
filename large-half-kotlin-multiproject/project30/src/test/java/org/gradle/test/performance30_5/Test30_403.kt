package org.gradle.test.performance30_5

import org.junit.Assert.*

class Test30_403 {
    private val production = Production30_403("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}