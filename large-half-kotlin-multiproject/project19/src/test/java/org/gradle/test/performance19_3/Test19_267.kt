package org.gradle.test.performance19_3

import org.junit.Assert.*

class Test19_267 {
    private val production = Production19_267("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}