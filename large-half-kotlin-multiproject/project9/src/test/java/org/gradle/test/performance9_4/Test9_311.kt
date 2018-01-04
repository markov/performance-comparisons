package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_311 {
    private val production = Production9_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}