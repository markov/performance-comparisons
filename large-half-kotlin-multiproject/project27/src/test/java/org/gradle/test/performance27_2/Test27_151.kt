package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_151 {
    private val production = Production27_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}