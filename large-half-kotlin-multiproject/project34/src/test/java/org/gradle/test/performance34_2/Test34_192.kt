package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_192 {
    private val production = Production34_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}