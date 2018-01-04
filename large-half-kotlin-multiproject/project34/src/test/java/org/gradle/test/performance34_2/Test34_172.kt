package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_172 {
    private val production = Production34_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}