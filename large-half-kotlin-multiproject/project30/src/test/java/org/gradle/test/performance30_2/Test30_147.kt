package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_147 {
    private val production = Production30_147("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}