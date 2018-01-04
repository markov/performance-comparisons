package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_163 {
    private val production = Production2_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}