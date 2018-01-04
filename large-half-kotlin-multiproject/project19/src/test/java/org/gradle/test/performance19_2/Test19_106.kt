package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_106 {
    private val production = Production19_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}