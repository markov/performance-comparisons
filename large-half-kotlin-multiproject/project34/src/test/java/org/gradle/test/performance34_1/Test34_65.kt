package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_65 {
    private val production = Production34_65("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}