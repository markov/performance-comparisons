package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_163 {
    private val production = Production19_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}