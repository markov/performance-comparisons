package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_72 {
    private val production = Production19_72("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}