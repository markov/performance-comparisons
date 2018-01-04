package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_36 {
    private val production = Production34_36("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}