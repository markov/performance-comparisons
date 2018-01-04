package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_154 {
    private val production = Production19_154("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}