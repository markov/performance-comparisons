package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_151 {
    private val production = Production9_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}